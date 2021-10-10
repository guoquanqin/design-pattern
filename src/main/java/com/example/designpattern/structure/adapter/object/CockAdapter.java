package com.example.designpattern.structure.adapter.object;

/**
 * 鸡的适配器，可以把鸭的功能赋予鸡
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 15:15
 */
public class CockAdapter implements Duck{
    Cock cock ;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    /**
     * 实现鸭的呱呱叫方法
     */
    @Override
    public void quack() {
        // 其实内部是鸡在叫
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
