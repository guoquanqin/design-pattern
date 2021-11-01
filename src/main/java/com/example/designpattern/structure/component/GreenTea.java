package com.example.designpattern.structure.component;

/**
 * 绿茶
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/1 11:47
 */
public class GreenTea extends Beverage{
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
