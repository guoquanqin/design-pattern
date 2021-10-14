package com.example.designpattern.structure.bridge;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/14 15:59
 */
public class Rectangle extends Shape{
    private int x;
    private int y;
    public Rectangle(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }
    public void draw() {
        drawAPI.draw(0, x, y);
    }
}
