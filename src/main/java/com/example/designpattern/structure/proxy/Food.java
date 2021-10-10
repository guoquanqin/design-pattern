package com.example.designpattern.structure.proxy;

import lombok.Data;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 10:45
 */
@Data
public class Food {

    private String noodle;

    private String salt;

    public void addCondiment(String pepper) {
        return;
    }
}
