package com.example.designpattern.create.factory.abstratc;

/**
 * 测试类
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/9 17:19
 */
public class Test {
    public static void main(String[] args) {

        ComputerFactory factory = new IntelFactory();
        factory.makeCPU();
        factory.makeMainBoard();
    }
}
