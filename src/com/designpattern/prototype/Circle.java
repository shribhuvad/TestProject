package com.designpattern.prototype;
public class Circle implements Prototype {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}

