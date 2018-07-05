package designModel.chainOfResponsibility;

/**
 * 职责链模式
 * 先交给经理处理，如果经理无法处理，那么交给总监处理，
 * 如果总监也无法处理，那么就交给总经理处理，知道最后有人处理
 */
public class TestManager {
    public static void main(String[] args) {
        Manager m1 = new CommonManager("经理");
        Manager m2 = new Majordomo("总监");
        Manager m3 = new GeneralManager("总经理");

        m1.setSuperior(m2);
        m2.setSuperior(m3);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("生病了");
        request.setRequestNumber(3);

        m1.requestHandlder(request);
        System.out.println("-----------分割线--------------");

        Request request1 = new Request();
        request1.setRequestType("加薪");
        request1.setRequestContent("工资太低，无法生存");
        request1.setRequestNumber(100);

        m1.requestHandlder(request1);

    }
}
