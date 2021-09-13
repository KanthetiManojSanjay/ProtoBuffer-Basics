package com.learning.protobuff;

import com.learning.models.BodyStyle;
import com.learning.models.Car;
import com.learning.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {


        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .setBodyStyle(BodyStyle.COUPE)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setBodyStyle(BodyStyle.SUV)
                .setYear(2005)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2020, accord)
                .putModel(2005, civic)
                .build();

        System.out.println(dealer.getModelOrThrow(2005));
        System.out.println(dealer.getModelOrDefault(2019, accord));
        System.out.println(dealer.getModelCount());
        // By default bodyStype will be assigned with key which is =0 in proto
        System.out.println(dealer.getModelOrThrow(2005).getBodyStyle());

    }
}
