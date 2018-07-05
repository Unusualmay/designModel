package designModel.templateMethod;

/**
 * 模板方法模式
 * 父类中定义好了算法的骨架，有一些步骤延迟到子类中完成，子类不得更改算法的框架
 * 可以重定义算法中某些特定的步骤
 */

/**
 * 将所有不变与变化的都在父类中声明，在子类中重新定义变化部分的方法，从而实现代码的复用
 */
public class TestPaper {
    public void testQuestion1(){
        System.out.println("杨过得到，后来给了郭靖，练成倚天剑，屠龙刀的玄铁可能是：" +
                "a.球磨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");
        System.out.println("答案：" + answer1());
    }
    public void testQuestion2() {
        System.out.println("杨过，程英，陆无双铲除了情花，造成： a.使得这种植物不再害人 " +
                "b.使得一种珍惜物种灭绝 c.破坏了那个生物全的生态平衡 d.造成该地区沙漠化");
        System.out.println("答案：" + answer2());
    }
    public void testQuestion3() {
        System.out.println("蓝凤凰致使华山师徒，桃谷六仙呕吐不止，如果你是大夫，会给他们下什么药：" +
                "a.阿司匹林 b.牛黄解毒片 c.青霉素 d.让他们喝大量的生牛奶 e.以上都不对");
        System.out.println("答案：" + answer3());
    }
    public String answer1() {
        return "";
    }
    public String answer2() {
        return "";
    }
    public String answer3() {
        return "";
    }
}
