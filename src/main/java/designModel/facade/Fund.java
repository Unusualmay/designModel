package designModel.facade;

public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;
    NationalDebt nationalDebt;
    Realty realty;
    public Fund() {
        this.stock1 = new Stock1();
        this.stock2 = new Stock2();
        this.stock3 = new Stock3();
        this.nationalDebt = new NationalDebt();
        this.realty = new Realty();
    }

    public void sell() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }

    public void buy() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }
}
