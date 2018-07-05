package designModel.adapter;

/**
 * 这就是适配器模式
 * 使用一个已经存在的类，但是如果他的接口，也就是他的方法和你的要求不相同时，就应该考虑使用适配器的模式
 * 两个类所做的事情相同或者类似的时候，但是具有不同的接口时要使用它，这样客户代码就可以统一调用同一个接
 * 口就可以了，但是适用的场合是在双方都不太容易修改的时候再适用适配器模式适配；
 * Notice:只有在碰到无法改变原有设计和代码情况下，才考虑适配模式
 */
public class TestDemo {
    public static void main(String[] args) {
        Player forwards = new Forwards("麦克");
        forwards.attack();
        Player center = new Center("阿米汗");
        center.defense();
        Player guards = new Guards("乔密");
        Player adaptor = new Translator("姚明");
        adaptor.attack();
        adaptor.defense();
    }
}
