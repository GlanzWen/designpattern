package org.example.designpattern.creationtype.Dprototype;

public class Square extends Shape{

    public Square() {
        this.setType("square");
    }
    @Override
    void draw() {
        System.out.println("square");
    }
}
