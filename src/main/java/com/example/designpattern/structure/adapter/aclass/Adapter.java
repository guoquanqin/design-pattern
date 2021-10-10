package com.example.designpattern.structure.adapter.aclass;

/**
 * 适配器类
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 18:08
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //继承了被适配类，同时实现标准接口
        super.specificRequest();
    }
}
