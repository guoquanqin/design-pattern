package com.example.designpattern.structure.facade;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/1 15:03
 */
public class Client {
    public static void main(String[] args) {
        ShapeFacade shapeMaker = new ShapeFacade();
        // 客户端调用现在更加清晰了
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
