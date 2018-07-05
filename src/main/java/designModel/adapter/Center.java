package designModel.adapter;

public class Center extends Player {
    String name;
    public Center(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("中锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋" + name + "防守");
    }
}
