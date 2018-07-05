package designModel.bridge;

import java.util.ArrayList;
import java.util.List;

abstract class HandsetBrand {
    protected List<HandsetSoft> softList = new ArrayList<>();
    public void addSoft(HandsetSoft soft) {
        softList.add(soft);
    }

    public abstract void run();
}

class HandsetBrandN extends HandsetBrand {
    @Override
    public void run() {
        for (HandsetSoft soft : softList) {
            soft.run();
        }
    }
}

class HandsetBrandM extends HandsetBrand {
    @Override
    public void run() {
        for (HandsetSoft soft : softList) {
            soft.run();
        }
    }
}

class HandsetBrandP extends HandsetBrand {
    @Override
    public void run() {
        for (HandsetSoft soft : softList) {
            soft.run();
        }
    }
}