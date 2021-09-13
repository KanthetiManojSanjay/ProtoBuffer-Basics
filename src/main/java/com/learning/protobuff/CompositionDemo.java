package com.learning.protobuff;

import com.google.protobuf.Int32Value;
import com.learning.models.Address;
import com.learning.models.Car;
import com.learning.models.Person;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("main street")
                .setCity("Atlanta")
                .build();

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2020)
                .build();

        List<Car> cars = new ArrayList();
        cars.add(accord);
        cars.add(civic);

        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .setAddress(address)
                .addAllCar(cars)
//                .addCar(accord)
//                .addCar(civic)
                .build();

        System.out.println(sam);
        System.out.println(sam.hasAge());

    }
}
