package com.company;

public class Square extends Shape {
    @Override
    public void getArea(double radius) {
        double area = 4 * Math.pow(radius, 2);
        System.out.println("Square  area is` " + area);

    }

    @Override
    public void getPerimetr(double radius) {
        double perimetr = 8 * radius;
        System.out.println("Square perimeter is ` " + perimetr);

    }
}
