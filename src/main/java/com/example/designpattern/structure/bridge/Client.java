package com.example.designpattern.structure.bridge;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/14 15:58
 */
public class Client {
    public static void main(String[] args) {
        Shape shape = new Circle(0,new GreenPen());
        shape.draw();
    }
}
