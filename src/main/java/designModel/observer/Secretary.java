package designModel.observer;

import java.util.ArrayList;
import java.util.List;

public class Secretary extends Subject{
    private String subjectState;
    private List<Observer> observerList = new ArrayList<Observer>();//在类中的变量是全局变量，也是成员变量

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void inform() {
        for(Observer observer:observerList) {
            observer.update();
        }
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

}
