package designModel.Builder;

import java.awt.*;

public class PersonFatBuilder extends PersonBuilder {
    public PersonFatBuilder(Graphics g) {
        super(g);
    }
    @Override
    public void buildHead() {
        g.drawOval(50,20,30,30);
    }

    @Override
    public void bulidBody() {
        g.drawOval(45,50,40,50);
    }

    @Override
    public void buildArmLeft() {
        g.drawLine(50,50,30,100);
    }

    @Override
    public void buildArmRight() {
        g.drawLine(80,50,30,100);
    }

    @Override
    public void buildLegLeft() {
        g.drawLine(60,100,45,150);
    }

    @Override
    public void buildLegRight() {
        g.drawLine(70,100,85,150);
    }
}
