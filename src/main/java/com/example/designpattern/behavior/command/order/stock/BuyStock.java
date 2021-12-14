package com.example.designpattern.behavior.command.order.stock;

import com.example.designpattern.behavior.command.Order;
import com.example.designpattern.behavior.command.Stock;

/**
 * order接口实现类
 *
 * @author guoquanqin
 * @version 1.0, 2021/12/14 15:21
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
