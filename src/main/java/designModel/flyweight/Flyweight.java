package designModel.flyweight;

abstract class Flyweight {
    public abstract void operation(int extrinsicstate);
}

class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("共享的具体Flyweight"+extrinsicstate);
    }
}

class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight"+extrinsicstate);
    }
}
