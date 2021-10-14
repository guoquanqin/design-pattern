package com.example.designpattern.structure.bridge;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/14 15:55
 */
public class Circle extends Shape {
    private int radius;
    protected Circle(int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius,0,0);
    }
}
