package designModel.visitor;

/**
 * 状态抽象类
 */
abstract class Action {
    protected String name;
    public Action(String name) {
        this.name = name;
    }
    public abstract void getManConclusion(Man concreteElementA);

    public abstract void getWomanConclusion(Woman concreteElementB);
}

class Success extends Action {
    public Success(String name) {
        super(name);
    }
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.name+this.name+"时，背后都会有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.name+this.name+",背后大多都有一个不成功的男人");
    }
}

class Failure extends Action {
    public Failure(String name) {
        super(name);
    }

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.name+this.name+"闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.name+this.name+"眼泪汪汪，谁也劝不了");
    }
}

class FallinLove extends Action {
    public FallinLove(String name) {
        super(name);
    }

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.name+this.name+",凡事不懂也要装懂");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.name+this.name+"遇事懂也装不懂");
    }
}

