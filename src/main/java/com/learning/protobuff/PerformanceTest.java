package com.learning.protobuff;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.learning.json.JPerson;
import com.learning.models.Person;

public class PerformanceTest {
    public static void main(String[] args) {

        //json
        JPerson person = new JPerson();
        person.setName("Sam");
        person.setAge(10);
        ObjectMapper mapper = new ObjectMapper();


        Runnable json = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                mapper.readValue(bytes, JPerson.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        //protobuff
        Person sam = Person.newBuilder().setName("Sam")
                //.setAge(10)
                .build();

        Runnable proto = () -> {
            try {
                byte[] bytes = sam.toByteArray();
                Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i <= 5; i++) {
            runPerformanceTest(json, "Json");
            runPerformanceTest(proto, "Proto");
        }


    }

    private static void runPerformanceTest(Runnable runnable, String method) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            runnable.run();
        }
        long time2 = System.currentTimeMillis();
        System.out.println(method + " : " + (time2 - time1) + " ms");
    }
}
