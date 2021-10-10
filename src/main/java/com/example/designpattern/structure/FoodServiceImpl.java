package com.example.designpattern.structure;

import org.springframework.stereotype.Service;

/**
 * TODO 添加类的描述
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 10:46
 */
@Service
public class FoodServiceImpl implements FoodService{
    @Override
    public Food makeChicken() {
        Food f = new Chicken();
        f.setNoodle("1kg");
        f.setSalt("1g");
        return f;
    }

    @Override
    public Food makeNoodle() {
        Food f = new Noodle();
        f.setNoodle("500g");
        f.setSalt("5g");
        return f;
    }
}
