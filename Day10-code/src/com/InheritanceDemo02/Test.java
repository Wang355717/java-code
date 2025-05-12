package com.InheritanceDemo02;

/**
 * {@code @Author:} kali-莫小领
 * {@code @Date:} 2025/5/12 -  - 12 - 17:08
 * {@code @Description:} com.InheritanceDemo02
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Dog dog = new Dog(2,"黑");
        p.keepPet(dog,"骨头");

        Person p2 = new Person("老李",25);
        Cat cat = new Cat(3,"灰");
        p2.keepPet(cat,"鱼");
    }
}
