package designModel.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("李娇娇");
        Proxy daili = new Proxy(mm);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
