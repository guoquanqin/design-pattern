package com.example.designpattern.behavior.command;

import com.example.designpattern.behavior.command.order.stock.BuyStock;
import com.example.designpattern.behavior.command.order.stock.SellStock;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 15:24
 */
public class Client {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
