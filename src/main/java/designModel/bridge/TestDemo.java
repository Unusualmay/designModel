package designModel.bridge;

/**
 * 桥接模式
 * 手机品牌和手机软件之间不能是继承的关系，是聚合的关系，所以手机品牌的抽象类中会有手机软件的引用
 * 抽象类手机品牌和具体的手机品牌类是继承的关系
 * 抽象类手机软件和具体的手机软件类是继承的关系
 * 继承是强耦合，父类变化，那么整个子类也要发生变化，所以不要轻易进行继承的操作
 */
public class TestDemo {
    public static void main(String[] args) {
        HandsetBrand ab = new HandsetBrandM();
        ab.addSoft(new HandsetGame());
        ab.addSoft(new HandsetAddressList());
        ab.run();

        HandsetBrand cd = new HandsetBrandM();
        cd.addSoft(new HandsetGame());
        cd.addSoft(new HandsetAddressList());
        cd.run();

        HandsetBrand ef = new HandsetBrandP();
        ef.addSoft(new HandsetMusic());
        ef.addSoft(new HandsetAddressList());
        ef.run();
    }
}
