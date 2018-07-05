package designModel;

public class Son extends Parent {
    public Son(String name) {
        super(name);
    }
    public void print() {
        System.out.println(name);
        //因为name在父类中的修饰符是protected,而且在同一个包内，所以可以直接访问
    }
}

