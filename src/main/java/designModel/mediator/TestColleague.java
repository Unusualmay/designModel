package designModel.mediator;

/**
 * 中介者模式
 * 例如同事１和同事２之间需要交流，中介者就充当一个桥梁的模式，使得两个对象之间不需要
 * 显式的相互引用，从而使其松耦合，而且可以独立的改变他们之间的交互
 */

/**
 * 由于有了Mediator，使得ConcreteColleague和ConcreteColleague2在发送消息和接收消息时
 * 是通过中介者来完成的，这就减少了他们之间的耦合度
 */
public class TestColleague {
    public static void main(String[] args) {
        ConcreteMediator1 mediator = new ConcreteMediator1();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("廉颇老矣？");
        colleague2.send("尚能饭否！");
    }
}
