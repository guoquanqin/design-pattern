package com.example.designpattern.behavior.template;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/12 17:31
 */
public class ConcreteTemplate extends AbstractTemplate{
    @Override
    protected void beforeProcess() {
        System.out.println("执行前置处理器");
    }

    @Override
    protected void afterProcess() {
        System.out.println("执行后置处理器");
    }
}
