package com.example.designpattern.create.factory.simple;

/**
 * 简单工厂
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/7 17:56
 */
public class Client {
    /**
     * 抽象食品
     *
     * @author guoquanqin
     * @version 1.0, 2021/10/7 17:53
     */
    public interface Food {
        void eat();
    }

    /**
     * 水果实现类
     *
     * @author guoquanqin
     * @version 1.0, 2021/10/7 17:55
     */
    public static class Fruit implements Food {
        @Override
        public void eat() {
            System.out.println("吃水果");
        }
    }

    /**
     * 零食实现类
     *
     * @author guoquanqin
     * @version 1.0, 2021/10/7 17:56
     */
    public static class Snack implements Food {
        @Override
        public void eat() {
            System.out.println("吃零食");
        }
    }


    static class SimpleFactory{
        public static Food eatFood(int type){
            switch (type){
                case 1:
                    return new Fruit();
                case 2:
                    return new Snack();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Food food = SimpleFactory.eatFood(1);
        food.eat();
    }

}
