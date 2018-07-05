package designModel.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> elements = new ArrayList<>();

    //增加
    public void attach(Person element) {
        elements.add(element);
    }

    //移除
    public void detach(Person element) {
        elements.remove(element);
    }

    //查看显示
    public void display(Action visitor) {
        for (Person element : elements) {
            element.accept(visitor);
        }
    }
}
