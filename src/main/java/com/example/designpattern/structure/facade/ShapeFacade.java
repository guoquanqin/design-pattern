package com.example.designpattern.structure.facade;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/1 15:02
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }
    /**
     * 下面定义一堆方法，具体应该调用什么方法，由这个门面来决定
     */
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
