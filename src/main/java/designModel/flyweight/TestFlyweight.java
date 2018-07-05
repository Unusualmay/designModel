package designModel.flyweight;

/**
 * 享元模式
 * 运用共享技术有效的支持大量细粒度的对象
 * 用一个享元工厂管理和创建具体的享元类
 */
public class TestFlyweight {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        int extrinsicstate = 22;

        Flyweight fx = flyweightFactory.getFlyweight('X');
        fx.operation(--extrinsicstate);

        Flyweight fy = flyweightFactory.getFlyweight('Y');
        fy.operation(--extrinsicstate);

        Flyweight fz = flyweightFactory.getFlyweight('Z');
        fz.operation(--extrinsicstate);

        Flyweight fu = new UnsharedConcreteFlyweight();
        fu.operation(--extrinsicstate);
    }
}
