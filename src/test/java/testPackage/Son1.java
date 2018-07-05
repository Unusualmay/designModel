package testPackage;

import designModel.Parent;

public class Son1 extends Parent{
    public Son1(String name) {
        super(name);
    }

    public void print1() {
        System.out.println(name);
        //虽然是不同包中的类，但是因为name的修饰符是protected,
        // 而且Son1是Parent的子类，所以还是可以访问name
    }
}

class Son2 {
    public Son2(String name) {
        System.out.println("这是Object的子类");
    }
    public void print2() {
        System.out.println("这里就没有办法访问Parent的name了，因为是属于其他类");
    }
}
