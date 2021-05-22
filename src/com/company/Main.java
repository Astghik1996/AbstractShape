package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = scanner.nextDouble();
        Circle circle = new Circle();
        Square square = new Square();
        circle.getPerimetr(radius);
        circle.getArea(radius);
        square.getArea(radius);
        square.getPerimetr(radius);
    }
}
