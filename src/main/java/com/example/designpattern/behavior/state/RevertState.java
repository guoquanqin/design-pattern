package com.example.designpattern.behavior.state;

/**
 * 定义补库存状态
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 15:48
 */
public class RevertState implements State {

    public void doAction(Context context) {
        System.out.println("给此商品补库存");
        context.setState(this);

        //... 执行加库存的具体操作
    }

    public String toString() {
        return "Revert State";
    }
}
