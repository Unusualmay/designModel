package designModel.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器来负责
 * 这样既可以不暴露集合的内部结构，又可以让外部代码透明的访问集合内部的数据
 */
public class TestDemo {
    public static void main(String[] args) {

    }
}

abstract class Iterator {
    public abstract Object getFirst();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}

abstract class Aggregate {
}

class ConreteIterator extends Iterator {
    private ConreteAggregate aggregate;

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}

class ConreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    public int getCount() {
        return items.size();
    }

    public void add(Object o) {
        items.add(o);
    }
}
