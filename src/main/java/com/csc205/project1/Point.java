package com.csc205.project1;

/*
CHATGPT Conversation used -
I need to design a class called Point in Java that represents a location in the Cartesian Plane to use with a with this driver class "public class Project1 {

    public static void main(String[] args) {

        System.out.println("Project 1 : Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        System.out.println("\nDistance: " + a.distance(b));

        double rotation = Math.PI / 2.0;
        a.rotate(rotation);
        System.out.println("\nRotated a " + rotation + ": " + a);

        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Shifted b " + b.distance(b2) + " away from original position: " + b);

    }
}"

To which it generated most of the code.
 */

public class Point {

    private double x;
    private double y;

    // Constructor
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate the distance between this point and another point
    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Rotate this point by a given angle (in radians) around the origin (0,0)
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // Shift this point's x-coordinate by a given amount
    public void shiftX(double amount) {
        this.x += amount;
    }

    // Shift this point's y-coordinate by a given amount
    public void shiftY(double amount) {
        this.y += amount;
    }

    @Override
    public String toString() {
        return "{" + "x=" + x + ", " + "y=" + y + "}";
    }
}


