package com.example.designpattern.structure.composite;


/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/11/12 17:21
 */
public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee("11","11",1);
        employee.add(new Employee("22","22",2));
        System.out.println(employee);
    }
}
