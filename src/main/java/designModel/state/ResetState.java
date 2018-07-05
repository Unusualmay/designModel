package designModel.state;

public class ResetState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点下班回家了");
    }
}
