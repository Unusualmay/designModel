package designModel.interpreter;

abstract class AbstractExpression {
    public abstract void interpret(Context context);
}

class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器来解释:"+context.getName());
    }
}

class NonTerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器来解释:"+context.getName());
    }
}