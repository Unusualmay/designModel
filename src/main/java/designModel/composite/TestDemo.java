package designModel.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 * 组合模式使得用户对单个对象和组合对象的使用具有一致性
 * 组合模式定义了：包含人力资源部和财务这些基本对象和分公司，办事处等组合对象的类层次结构.
 * 基本对象可以本组合成更复杂的组合对象，而这个组合对象又可以被组合，这些不断地递归下去，
 * 客户代码中，任何可以使用到基本对象的地方都可以使用到组合对象．
 * 组合模式让客户可以一致的使用组合结构和单个对象
 */
public class TestDemo {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new ConcreteCompany("总公司人力资源部"));
        root.add(new ConcreteCompany("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new ConcreteCompany("华东分公司人力资源部"));
        comp.add(new ConcreteCompany("华东分公司财务部"));
        root.add(comp);

        ConcreteCompany comp2 = new ConcreteCompany("南京地方办事处");
        comp2.add(new ConcreteCompany("南京地方办事处人力资源部"));
        comp2.add(new ConcreteCompany("南京地方办事处财务部"));
        comp.add(comp2);

        System.out.println("结构图");
        root.dispaly(1);

        System.out.println("职责分工");
        root.lineOfDuty();
    }
}

abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);//添加

    public abstract void remove(Company c);//移除

    public abstract void dispaly(int depth);//显示

    public abstract void lineOfDuty();//履行职责
}

/**
 * 具体公司实现的类，实现接口，树枝结点
 */
class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void dispaly(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Company c : children) {
            c.dispaly(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {
        //这里不会执行子类的覆写方法么？？？
        for (Company c : children) {
            System.out.println(c.name);
            c.lineOfDuty();
        }
    }
}

/**
 * 人力资源部，属于树叶结点
 */
class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void dispaly(int depth) {
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"员工招聘培训");
    }
}

/**
 * 财务部，属于树叶结点
 */
class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void dispaly(int depth) {

    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "公司财务收支管理");
    }
}



