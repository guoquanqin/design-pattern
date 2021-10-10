package com.example.designpattern.structure.adapter.object;

/**
 * 对象适配器客户端
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 15:18
 */
public class Client {
    public static void main(String[] args) {
        // 把鸡的功能赋予了鸭，让鸭能做鸡做的事情
        Duck cockAdapter = new CockAdapter(new WildCock());
        cockAdapter.quack();
        cockAdapter.fly();
    }
}
