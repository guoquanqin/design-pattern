package com.example.designpattern.behavior.template;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/12 17:28
 */
public abstract class AbstractTemplate {
    // 这就是模板方法
    public void templateMethod() {
        init();
        // 前置处理器
        beforeProcess();
        // 后置处理器
        afterProcess();
        end(); // 可以作为钩子方法
    }

    protected void init() {
        System.out.println("初始化");
    }

    // 前置处理器
    protected abstract void beforeProcess();
    // 后置处理器
    protected abstract void afterProcess();

    protected void end() {
    }
}