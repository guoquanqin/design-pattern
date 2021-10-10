package com.example.designpattern.structure.proxy;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 10:52
 */
public class Client {
    public static void main(String[] args) {
        // 客户端一定要用代理实现类
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
    }
}
