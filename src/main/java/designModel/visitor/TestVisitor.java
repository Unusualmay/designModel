package designModel.visitor;

public class TestVisitor {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man("男人"));
        objectStructure.attach(new Woman("女人"));

        //成功时的反应
        Success v1 = new Success("成功");
        objectStructure.display(v1);

        //失败时的反应
        Failure v2 = new Failure("失败");
        objectStructure.display(v2);

        //恋爱时的反应
        FallinLove v3 = new FallinLove("恋爱");
        objectStructure.display(v3);
    }
}
