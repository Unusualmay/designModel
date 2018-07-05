package designModel.proxy;

public class Proxy implements IGiveGift {
    Pursuit gg;
    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }
    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
