package designModel.Builder;

import java.awt.*;

/**建造者模式
 * 这是一个抽象类，具体的实现由子类去实现
 */
abstract class PersonBuilder {
    protected Graphics g;
    public PersonBuilder(Graphics g) {
        this.g = g;
    }

    public abstract void buildHead();
    public abstract void bulidBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();

}
