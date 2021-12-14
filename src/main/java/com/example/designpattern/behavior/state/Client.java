package com.example.designpattern.behavior.state;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 15:49
 */
public class Client {
    public static void main(String[] args) {
        // 我们需要操作的是 iPhone X
        Context context = new Context("iPhone X");

        // 看看怎么进行补库存操作
        RevertState revertState = new RevertState();
        revertState.doAction(context);

        // 如果需要我们可以获取当前的状态
        System.out.println(context.getState().toString());;
        // 同样的，减库存操作也非常简单
        DeductState deductState = new DeductState();
        deductState.doAction(context);

        System.out.println(context.getState().toString());;
    }
}
