package designModel.adapter;

public class ForeignCenter {
    private String name;

    public  ForeignCenter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //外籍中锋智能看得懂中文的进攻
    public void 进攻() {
        System.out.println("外籍中锋" + name + "进攻");
    }
    //外籍中锋只能看得懂中文的防守
    public void 防守() {
        System.out.println("外籍中锋" + name + "防守");
    }
}
