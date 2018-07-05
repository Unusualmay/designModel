package designModel.chainOfResponsibility;

/**
 * 客户链模式
 * 客户提一个要求时，要求是沿链传递直到有一个ConcreteHandler来处理它
 */
public class TestHandler {
    public static void main(String[] args) {
        Handler h1 = new ConreteHandler1("小职员");
        Handler h2 = new ConcreteHandler2("经理");
        Handler h3 = new ConcreteHandler3("总经理");
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2,15,4,23,15,22,5,7};
        for (int i : requests) {
            h1.handleRequest(i);
        }

    }
}
