package designModel.flyweight;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FlyweightFactory {
    private HashMap<Character, Flyweight> flyweights = new LinkedHashMap<>();

    /**
     * 这里是事先创建了享元对象
     * 当然也可以事先不创建，等到需要的时候再去创建
     */
    public FlyweightFactory() {
        flyweights.put('X',new ConcreteFlyweight());
        flyweights.put('Y',new ConcreteFlyweight());
        flyweights.put('Z',new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(Character key) {
        return (Flyweight)flyweights.get(key);
    }
}
