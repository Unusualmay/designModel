package designModel.command;

import designModel.command.BakeChickenWingCommand;
import designModel.command.BakeMuttonCommand;
import designModel.command.Barbecuer;

/**
 * 命令模式
 * 这里是服务员从顾客中得到请求，然后通知厨师来响应请求
 * 其中，服务员要负责请求的增删改查，厨师则只负责响应顾客的请求
 */
public class TestDemo {
    public static void main(String[] args) {
        Barbecuer cookier = new Barbecuer();
        Waiter waiter = new Waiter();
        waiter.setOrder(new BakeMuttonCommand(cookier));
        waiter.setOrder(new BakeChickenWingCommand(cookier));
        waiter.notifyExecute();
    }
}
