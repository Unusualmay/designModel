package designModel.command;

import designModel.command.Command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<>();

    //设置订单
    public void setOrder(Command command) {
        if (command.toString() == "命令模式.bakeChickenWingCommand") {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            orders.add(command);
            System.out.println(String.format("增加订单：" + command.toString() +
                    "时间：" + new Date(System.currentTimeMillis())));
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单："+command.toString()+
                "时间："+System.currentTimeMillis());
    }

    //通知全部执行
    public void notifyExecute() {
        for (Command order : orders) {
            order.executeCommand();
        }
    }
}
