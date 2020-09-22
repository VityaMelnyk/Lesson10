package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
	Rectangle r1= new Rectangle(3,4);
        System.out.println(r1.getArea());
        System.out.println(Rectangle.getArea(5, 6));
        System.out.println(Math.sin(0.2));
        System.out.println(Rectangle.sides);
        System.out.println(Math.PI);

        Map<Integer, String> week = new HashMap<>();
        week.put(1,"Monday");
        week.put(2,"Tuesday");
        week.put(3,"Wednsday");
        week.put(4,"Thursday");
        week.put(5,"Friday");
        week.put(6,"Saturday");
        week.put(7,"Sunday");
        week.put(null,"Monday");
        week.put(8,"Monday");

        System.out.println(week);
    }
}
