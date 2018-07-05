package designModel.adapter;

public class Forwards extends Player {
    String name;
    //子类继承抽象类，则抽象类的构造方法要进行调用
    public Forwards(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("前锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋" + name + "防守");
    }
}
