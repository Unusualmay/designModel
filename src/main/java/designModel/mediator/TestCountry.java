package designModel.mediator;

/**
 * 中介者模式有优缺点：
 * 减少了ConcreteColleague类之间的耦合，但是ConcreteMediator这个类的责任太多
 * 它是星型的结构，中介是中间的媒介
 */
public class TestCountry {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
        USA usa = new USA(UNSC);
        Iraq iraq = new Iraq(UNSC);
        UNSC.setColleague1(usa);
        UNSC.setColleague2(iraq);

        usa.declare("不准研制核武器，否则要发动战争");
        iraq.declare("我们没有核武器，也不怕侵略");
    }
}
