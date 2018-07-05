package designModel.templateMethod;

public class TestPaperA extends TestPaper{
    //子类覆写了父类的answer系列的方法
    @Override
    public String answer1() {
        return "a";
    }

    @Override
    public String answer2() {
        return "b";
    }

    @Override
    public String answer3() {
        return "c";
    }
}
