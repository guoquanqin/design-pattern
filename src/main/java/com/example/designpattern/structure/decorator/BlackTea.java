package com.example.designpattern.structure.decorator;

/**
 * 红茶
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/1 11:47
 */
public class BlackTea extends Beverage{
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
