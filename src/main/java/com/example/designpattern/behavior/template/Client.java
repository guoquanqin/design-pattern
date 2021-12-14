package com.example.designpattern.behavior.template;

/**
 * 模板方法
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/12 17:32
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate concreteTemplate = new ConcreteTemplate();
        concreteTemplate.templateMethod();
    }
}

