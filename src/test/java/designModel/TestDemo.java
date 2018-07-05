package designModel;

import testPackage.Son1;

public class TestDemo {
    public static void main(String[] args) {
        //注意：父类的引用指向子类的对象，那么父类只能使用父类和子类共有的方法
        Son instance = new Son("小明哥");
        instance.print();
        Son1 instance2 = new Son1("小李子");
        instance2.print1();
    }
}
