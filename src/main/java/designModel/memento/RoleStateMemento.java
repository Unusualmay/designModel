package designModel.memento;

/**
 * 角色状态备忘录
 */
class RoleStateMemento {
    private int battlePower;
    private int liveValue;
    private int experinceValue;

    public RoleStateMemento (int battlePower, int liveValue, int experinceValue) {
        this.battlePower = battlePower;
        this.liveValue = liveValue;
        this.experinceValue = experinceValue;
    }

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
}
