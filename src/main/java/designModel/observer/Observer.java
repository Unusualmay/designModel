package designModel.observer;

abstract class Observer {
    private String name;
    private Subject sub;//这是抽象的通知者
//    public Observer(String name, Subject sub) {
//        this.name = this.name;
//        this.sub = this.sub;
//    }
    public abstract void update();
}
