package com.example.designpattern.structure.proxy;

/**
 * 代理要表现得“就像是”真实实现类，所以需要实现 FoodService
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/10 10:50
 */
public class FoodServiceProxy implements FoodService{
    // 内部一定要有一个真实的实现类，当然也可以通过构造方法注入
    private FoodService foodService = new FoodServiceImpl();
    @Override
    public Food makeChicken() {
        System.out.println("我们马上要开始制作鸡肉了");

        // 如果我们定义这句为核心代码的话，那么，核心代码是真实实现类做的，
        // 代理只是在核心代码前后做些“无足轻重”的事情
        // 代理模式说白了就是做 “方法包装” 或做 “方法增强”
        Food food = foodService.makeChicken();

        System.out.println("鸡肉制作完成啦，加点胡椒粉"); // 增强
        food.addCondiment("pepper");

        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("准备制作拉面~");
        Food food = foodService.makeNoodle();
        System.out.println("制作完成啦");
        return food;
    }
}
