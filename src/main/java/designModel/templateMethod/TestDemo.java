package designModel.templateMethod;

/**模板方法模式
 * 父类的引用指向子类的对象，则调用方法的时候，如果子类和父类同时拥有该方法，则优先调用子类中的方法
 */
public class TestDemo {
    public static void main(String[] args) {
        //学生A的答卷
        TestPaper testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();;
        testPaperA.testQuestion3();
        //学生B的答卷
        TestPaper testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
