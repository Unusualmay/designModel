package designModel.decorateModel;

public class Test {
    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("第一种装扮");

        Tshirts ts = new Tshirts();
        BigTrouser bt = new BigTrouser();
        BrokenShoes bs = new BrokenShoes();

        ts.decorate(xc);
        bt.decorate(ts);
        bs.decorate(bt);
        bs.show();

        System.out.println("第二种装扮方式");
        Suit st = new Suit();
        Tie tie = new Tie();
        LeatherShoes ls = new LeatherShoes();

        st.decorate(xc);
        tie.decorate(st);
        ls.decorate(tie);
        ls.show();
    }
}
