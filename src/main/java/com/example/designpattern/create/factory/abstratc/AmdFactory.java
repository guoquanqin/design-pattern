package com.example.designpattern.create.factory.abstratc;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/9 17:16
 */
public class AmdFactory implements ComputerFactory{
    @Override
    public void makeCPU() {
        System.out.println("Amd cpu maked");
    }

    @Override
    public void makeMainBoard() {
        System.out.println("Amd MainBoard maked");
    }
}
