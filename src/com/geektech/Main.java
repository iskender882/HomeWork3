package com.geektech;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {


        String[] names = {"Alex", "Steve", "Max"};
        String name = "Kenchik";
        String[] newName = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {

            newName[i] = names[i];
        }
        newName[names.length] = name;


        switch (newName[0]) {
            case "Alex":
                System.out.println("Alex доброго утра!");
            case "Steve":
                System.out.println("Steve доброго дня!");

            case "Max":
                System.out.println("Max доброго  вечера!");

            case "Kenchik":
                System.out.println("Salam Kenchik");
                break;
        }


    }
}
