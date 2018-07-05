package designModel.observer;

/** 观察者模式
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象
 * 在状态发生变化时，会通知所有的观察者对象，使得他们自动更新自己
 */

/**
 * 观察者模式所做的工作就是接触耦合。让耦合双方依赖于抽象，而不是依赖于具体。
 * 从而使得双方的变化不会影响一边的变化
 */

/**
 * 在观察者类中使用的是抽象类，而不是接口，这是因为抽象类可以共用一些代码，
 * 接口只是方法上的实现，没有方法体
 */
public class TestDemo {
    public static void main(String[] args) {
        //老板胡汉三
        Boss huhansan = new Boss();
        //看股票的同事1
        StockObeserver tongshi1 = new StockObeserver("魏冠斋",huhansan);
        //看NBA球赛的同事2
        NBAObeserver tongshi2 = new NBAObeserver("易冠茶",huhansan);
        //胡汉三要通知的同事对象
        huhansan.attach(tongshi1);
        huhansan.attach(tongshi2);
        //胡汉三没有通知到同事1
        huhansan.detach(tongshi1);
        //老板回来
        huhansan.setSubjectState("我胡汉三又回来了");
        //老板通知
        huhansan.inform();

    }
}
