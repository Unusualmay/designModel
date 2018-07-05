package designModel.observer;

public class NBAObeserver extends Observer{
    private String name;
    private Subject sub;
    public NBAObeserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState() + " " + name + "关闭NBA界面，好好工作");
    }
}
