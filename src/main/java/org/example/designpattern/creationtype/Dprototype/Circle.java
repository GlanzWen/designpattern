package org.example.designpattern.creationtype.Dprototype;

public class Circle extends Shape{
    public Circle () {
        this.setType("Circle");
    }

    @Override
    void draw() {
        System.out.println("circle");
    }


}
