package com.example.designpattern.structure.adapter.aclass;

/**
 * 类适配器
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 18:09
 */
public class Client {
    public static void main(String[] args) {
        // 使用适配类
        Target adapter = new Adapter();
        adapter.request();
    }
}
