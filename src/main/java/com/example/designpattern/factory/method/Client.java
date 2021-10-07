package com.example.designpattern.factory.method;

/**
 * 工厂方法模式
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/7 18:11
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
     * 苹果实现类
     *
     * @author guoquanqin
     * @version 1.0, 2021/10/7 17:55
     */
    public static class Apple implements Food {
        @Override
        public void eat() {
            System.out.println("吃苹果");
        }
    }

    /**
     * 香蕉实现类
     *
     * @author guoquanqin
     * @version 1.0, 2021/10/7 17:56
     */
    public static class Banana implements Food {
        @Override
        public void eat() {
            System.out.println("吃香蕉");
        }
    }

    /**
     * 白菜实现类
     *
     * @author guoquanqin
     * @version 1.0, 2021/10/7 17:55
     */
    public static class Cabbage implements Food {
        @Override
        public void eat() {
            System.out.println("吃白菜");
        }
    }

    /**
     * 土豆实现类
     *
     * @author guoquanqin
     * @version 1.0, 2021/10/7 17:56
     */
    public static class Potato implements Food {
        @Override
        public void eat() {
            System.out.println("吃土豆");
        }
    }

    public interface Factory{
        Food eatFood(int type);
    }

    /**
     * 水果工厂
     */
    static class FruitFactory implements Factory{
        public Food eatFood(int type){
            switch (type){
                case 1:
                    return new Apple();
                case 2:
                    return new Banana();
            }
            return null;
        }
    }

    /**
     * 蔬菜工厂
     */
    static class VegetablesFactory implements Factory{
        @Override
        public Food eatFood(int type) {
            switch (type){
                case 1:
                    return new Potato();
                case 2:
                    return new Cabbage();
            }
            return null;
        }
    }


}
