package designModel.mediator;

/**
 * 抽象同事类
 */
abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

/**
 * 具体同事类
 */
class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message,this);
    }

    public void notifys(String message) {
        System.out.println("同事１得到信息"+message);
    }
}

class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message,this);
    }

    public void notifys(String message) {
        System.out.println("同事２得到消息"+message);
    }
}