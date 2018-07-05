package designModel;

class Son1 {
    private String name;
    public Son1(String name) {
        this.name = name;
    }
    public void print() {

        Parent p = new Parent(name);
        System.out.println(p.name);
    }
}
