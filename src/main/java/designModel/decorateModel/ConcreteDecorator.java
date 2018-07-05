package designModel.decorateModel;

/**
 * 具体服饰类
 */
class Tshirts extends Finery {
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
class BigTrouser extends Finery {
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
class BrokenShoes extends Finery {
    public void show(){
        System.out.println("破球鞋");
        super.show();
    }
}
class Suit extends Finery {
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
class Tie extends Finery {
    public  void show() {
        System.out.println("领带");
        super.show();
    }
}
class LeatherShoes extends Finery {
    public void show() {
        System.out.println("皮鞋");
        super.show();
    }
}