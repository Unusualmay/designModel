package designModel.interpreter;

import java.util.ArrayList;
import java.util.List;

public class TestExpression {
    public static void main(String[] args) {
        Context context = new Context("待解释的文档的名字");
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());

        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }
    }
}
