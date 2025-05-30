package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom bedroom = new Bedroom("Hakan",new Wall("West"),new Wall("East"),new Wall("South"),new Wall("North"),new Ceiling(3, PaintColor.WHITE),new Bed("X",2,1,3,1),new Lamp(LampType.NEON,true,90),new Wardrobe(4,2,50),new Carpet(1,2,PaintColor.WHITE));

        System.out.println(bedroom.getCarpet().getColor());
        System.out.println(bedroom.getWardrobe().getWeight());
        System.out.println(bedroom.getLamp().getGlobalRating());
    }
}