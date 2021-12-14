package com.example.designpattern.behavior.state;

/**
 * 定义减库存的状态
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 15:48
 */
public class DeductState implements State {

    public void doAction(Context context) {
        System.out.println("商品卖出，准备减库存");
        context.setState(this);

        //... 执行减库存的具体操作
    }

    public String toString() {
        return "Deduct State";
    }
}
