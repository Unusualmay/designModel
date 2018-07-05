package designModel.factory;

public class FactoryTest {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();
        student.sweep();
    }
}
