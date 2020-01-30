package com.company;

public class Point {

    private int x, y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2));
    }

    public double distance(int x2, int y2) {
        System.out.println(this.x + " " + this.y);
        return Math.sqrt(Math.pow(this.x - x2, 2) + Math.pow(this.y - y2, 2));
    }

    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(this.x - newPoint.getX(), 2) + Math.pow(this.y - newPoint.getY(), 2));

    }
}