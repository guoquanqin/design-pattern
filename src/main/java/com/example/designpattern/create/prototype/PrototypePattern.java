package com.example.designpattern.create.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * 原型模式
 * 原型模式的克隆分为浅克隆和深克隆
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *
 * @author guoquanqin
 * @version 1.0, 2021/10/7 17:35
 */
@Slf4j
public class PrototypePattern {

    static class Realizetype implements Cloneable{
        Realizetype() {
            log.info("具体原型创建成功！");
        }
        public Object clone() throws CloneNotSupportedException {
            log.info("具体原型复制成功！");
            return (Realizetype) super.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println("obj1==obj2?" + (obj1 == obj2));
        /**
         * 输出：
         * 具体原型创建成功！
         * 具体原型复制成功！
         * obj1==obj2?false
         */
    }

}
