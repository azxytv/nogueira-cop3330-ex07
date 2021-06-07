package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double conversion = .09290304;
        Scanner w = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        double length = l.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double width = w.nextDouble();
        System.out.println("You entered dimensions of "+ length + " feet by " + width + " feet.");
        System.out.println("The area is");
        double area = length * width;
        double newarea = area * conversion;

        System.out.println(area + "square feet");
        System.out.println(newarea + " square meters");



    }
}