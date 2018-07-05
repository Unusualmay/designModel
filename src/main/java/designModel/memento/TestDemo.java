package designModel.memento;

/**
 * 备忘录模式
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态．这样以后就可以将该
 * 对象恢复到原先保存的状态
 */
public class TestDemo {
    public static void main(String[] args) {
        //大战boss前
        Houyi houyi = new Houyi();
        houyi.getInitState();
        houyi.stateDisplay();

        //保存进度(管理者进行保存)
        RoleStateMemento memento = houyi.memento();
        RoleStateMementoCracker roleStateMementoCracker = new RoleStateMementoCracker();
        roleStateMementoCracker.setMemento(memento);

        //大战boss时，损耗严重
        houyi.fight();
        houyi.stateDisplay();

        //恢复之前的状态
        RoleStateMemento memento1 = roleStateMementoCracker.getMemento();
        houyi.recoveryRoleState(memento1);
        houyi.stateDisplay();
    }
}

