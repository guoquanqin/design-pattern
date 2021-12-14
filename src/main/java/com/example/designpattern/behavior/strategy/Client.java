package com.example.designpattern.behavior.strategy;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/12 17:47
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new RedPen()); // 使用红色笔来画
        context.executeDraw(10, 0, 0);
    }

}
