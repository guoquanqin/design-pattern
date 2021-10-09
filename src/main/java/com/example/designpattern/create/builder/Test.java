package com.example.designpattern.create.builder;

/**
 * 测试类
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/9 17:28
 */
public class Test {
    public static void main(String[] args) {
        User d = User.builder()
                .name("foo")
                .password("pAss12345")
                .age(25)
                .build();
        System.out.println(d);
    }
}
