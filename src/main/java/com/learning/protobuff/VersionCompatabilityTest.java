package com.learning.protobuff;

import com.learning.models.Television;
//import com.learning.models.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatabilityTest {
    public static void main(String[] args) throws IOException {
        Path pathV1 = Paths.get("tv-v1");
        Path pathV2 = Paths.get("tv-v2");
    /*
        Television television = Television.newBuilder()
                .setBrand("sony")
                .setYear(2015)
                .build();

        Path pathV1 = Paths.get("tv-v1");
        Files.write(pathV1, television.toByteArray());
    */
        /*
        Path pathV1 = Paths.get("tv-v1");
        byte[] bytes = Files.readAllBytes(pathV1);
        System.out.println(Television.parseFrom(bytes));
        System.out.println(Television.parseFrom(bytes).getType());
      */

        /*Television television = Television.newBuilder()
                .setBrand("sony")
                .setModel(2015)
                .setType(Type.OLED)
                .build();

        Files.write(pathV2, television.toByteArray());*/


        byte[] bytes = Files.readAllBytes(pathV1);
        System.out.println(Television.parseFrom(bytes));
//        System.out.println(Television.parseFrom(bytes).getType());

    }
}
