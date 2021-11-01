package com.example.designpattern.structure.decorator;

/**
 * 装饰器
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/1 11:50
 */
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new GreenTea();
        beverage = new Lemon(beverage); // 先加一份柠檬
        beverage = new Mango(beverage); // 再加一份芒果
        System.out.println(beverage.getDescription() + " 价格：￥" + beverage.cost());
    }

}
