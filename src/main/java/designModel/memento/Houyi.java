package designModel.memento;

class Houyi {
    private int battlePower;
    private int liveValue;
    private int experinceValue;

    public int getBattlePower() {
        return battlePower;
    }

    public void setBattlePower(int battlePower) {
        this.battlePower = battlePower;
    }

    public int getLiveValue() {
        return liveValue;
    }

    public void setLiveValue(int liveValue) {
        this.liveValue = liveValue;
    }

    public int getExperinceValue() {
        return experinceValue;
    }

    public void setExperinceValue(int experinceValue) {
        this.experinceValue = experinceValue;
    }

    /**
     * 角色状态展示
     */
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("攻击力：" + this.battlePower);
        System.out.println("生命值：" + this.liveValue);
        System.out.println("经验值：" + this.experinceValue);
    }

    /**
     * 获得初始状态
     * 数据通常来自本机磁盘或者远程数据库
     */
    public void getInitState() {
        this.battlePower = 100;
        this.liveValue = 100;
        this.experinceValue = 100;
    }

    /**
     * 战斗后的状态
     */
    public void fight() {
        this.battlePower = 0;
        this.liveValue = 0;
        this.experinceValue = 0;
    }

    /**
     * 保存角色状态
     * @return
     */
    public RoleStateMemento memento() {
        return new RoleStateMemento(battlePower,liveValue,experinceValue);
    }

    /**
     * 恢复角色状态
     * @param memento　角色状态备忘录
     */
    public void recoveryRoleState(RoleStateMemento memento) {
        this.battlePower = memento.getBattlePower();
        this.liveValue = memento.getLiveValue();
        this.experinceValue = memento.getExperinceValue();
    }
}
