package designModel.Builder;

import java.awt.*;

/**
 * 建造者模式就是将所有的步骤写在抽象的父类中，然后由子类去实现抽象方法，这样就不会漏掉某些步骤
 * 一个指挥者和抽象父类之间进行关联，这样指挥者就可以根据用户需求来创建对象
 */
public class TestDemo {
    public static void main(String[] args) {
        Graphics g = null;
        PersonThinBuilder ptb = new PersonThinBuilder(g);
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.createPerson();


    }
}
