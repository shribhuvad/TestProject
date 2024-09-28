package com.designpattern.prototype;
public class Client {
    public static void main(String[] args) {
        // Create prototype instances
        Circle circlePrototype = new Circle(5);
        Rectangle rectanglePrototype = new Rectangle(10, 15);

        // Clone prototype objects to create new objects
        Circle clonedCircle = (Circle) circlePrototype.clone();
        Rectangle clonedRectangle = (Rectangle) rectanglePrototype.clone();

        // Modify cloned objects if needed
        clonedCircle.setRadius(7);
        clonedRectangle.setWidth(12);

        // Output details of cloned objects
        System.out.println("Cloned Circle - Radius: " + clonedCircle.getRadius());
        System.out.println("Cloned Rectangle - Width: " + clonedRectangle.getWidth() +
                ", Height: " + clonedRectangle.getHeight());
    }
}
