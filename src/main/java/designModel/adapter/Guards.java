package designModel.adapter;

public class Guards extends Player {
    String name;
    public Guards(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("后卫" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫" + name + "防守");
    }
}
