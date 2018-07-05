package designModel.mediator;

/**
 * 抽象中介类
 */
abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}

/**
 * 具体中介类
 */
class ConcreteMediator1 extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notifys(message);
        }
        else {
            colleague1.notifys(message);
        }

    }
}