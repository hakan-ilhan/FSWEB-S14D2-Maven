package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("IDK",new Wall("North"),new Wall("South"),new Wall("West"),new Wall("North"),new Ceiling(6, PaintColor.WHITE),new Bed("IDK2",5,6,7,8),
                new Lamp(LampType.NORMAL,true, 80),new Wardrobe(8,4,100.0),new Carpet(2,2,PaintColor.WHITE));

        System.out.println(bedroom.getLamp().toString());
    }
}