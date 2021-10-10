package com.example.designpattern.structure.adapter.object;

/**
 * 野鸡实现类
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 15:13
 */
public class WildCock implements Cock{
    @Override
    public void gobble() {
        System.out.println("鸡咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡飞起来了！");
    }
}
