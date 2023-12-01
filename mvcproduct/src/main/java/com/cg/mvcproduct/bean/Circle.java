package com.cg.mvcproduct.bean;

public class Circle {
    private float radius;
    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + "  " + super.toString();
    }
}
