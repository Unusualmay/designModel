package designModel.observer;

import java.util.List;
import java.util.ArrayList;

/**
 * 这里是抽象类，如果是接口的也是可以的
 * 需要注意一点的是：接口中不能定义private的属性，而且变量必须要进行初始化的操作
 */
abstract class Subject {
    //增加观察者
   public abstract void attach(Observer observer);
   //移除观察者
   public abstract void detach(Observer observer);
   //通知观察者
   public abstract void inform();
   private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
