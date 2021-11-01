package com.example.designpattern.structure.decorator;

/**
 * 饮料抽象基类
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/1 11:47
 */
public abstract class Beverage {

    // 返回描述
    public abstract String getDescription();
    // 返回价格
    public abstract double cost();
}
