package com.example.designpattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 15:24
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}