package designModel.adapter;

public class Translator extends Player {
    String name;
    ForeignCenter foreignCenter;
    public Translator(String name) {
        super(name);
        this.name = name;
        foreignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
