package designModel.bridge;

abstract class HandsetSoft {
    public abstract void run();
}

class HandsetGame extends HandsetSoft {
    @Override
    public void run() {
        System.out.println("运行手机游戏");
    }
}

class HandsetAddressList extends HandsetSoft {
    @Override
    public void run() {
        System.out.println("运行手机通讯录");
    }
}

class HandsetMusic extends HandsetSoft {
    @Override
    public void run() {
        System.out.println("运行手机MP3");
    }
}
