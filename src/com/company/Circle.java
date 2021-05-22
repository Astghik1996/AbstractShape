package com.company;

public class Circle extends Shape {

    @Override
    public void getArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("circle area is` " + area);

    }

    @Override
    public void getPerimetr(double radius) {
        double perimetr = 2 * Math.PI * radius;
        System.out.println("Circle perimeter is ` " + perimetr);

    }
}
