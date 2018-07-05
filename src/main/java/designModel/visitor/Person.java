package designModel.visitor;

abstract class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public abstract void accept(Action visitor);
}

class Man extends Person {
    public Man(String name) {
        super(name);
    }
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}

class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
