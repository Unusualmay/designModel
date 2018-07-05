package designModel.observer;

public class StockObeserver extends Observer{
    private Subject sub;
    private String name;

    public StockObeserver(String name, Subject sub) {
        this.sub = sub;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState()+" " + this.name+ "关闭股票行情，继续工作");

    }
}
