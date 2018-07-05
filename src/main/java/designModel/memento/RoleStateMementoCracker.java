package designModel.memento;

/**
 * 角色状态备忘录管理者－－仅仅起到保存的作用，所以不能对备忘录进行别的操作
 * 这个类是负责保存好备忘录，不能对备忘录的内容进行操作或者检查
 */
class RoleStateMementoCracker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
