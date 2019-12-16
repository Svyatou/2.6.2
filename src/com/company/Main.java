package com.company;

abstract class Figure{
    public float x;
    public float y;
    public abstract float getArea();
    public abstract float getPerimeter();

    public Figure(float x, float y){
        this.x = x;
        this.y = y;
    }

}

class Rectangle extends Figure{

    public float height;
    public float width;

    public Rectangle(float x, float y, float height, float width){
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public float getPerimeter(){
        return width*2 + height*2;
    }
    public float getArea(){
        return width * height;
    }
}

class Circle extends Figure{

    public float radius;

    public Circle(float x, float y, float radius){
        super(x,y);
        this.radius = radius;
    }

    public float getPerimeter(){
        return (float) (2*Math.PI*radius);
    }

    public float getArea(){
        return (float) (Math.PI*radius*radius);
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}

