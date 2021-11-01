package com.example.designpattern.structure.component;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/1 11:49
 */
public class Mango extends Condiment{
    private Beverage bevarage;
    public Mango(Beverage bevarage) {
        this.bevarage = bevarage;
    }
    public String getDescription() {
        return bevarage.getDescription() + ", 加芒果";
    }
    public double cost() {
        return bevarage.cost() + 3; // 加芒果需要 3 元
    }
}
