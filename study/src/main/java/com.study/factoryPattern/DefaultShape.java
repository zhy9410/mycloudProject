package com.study.factoryPattern;

public class DefaultShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside DefaultShape::draw() method.");
    }
}
