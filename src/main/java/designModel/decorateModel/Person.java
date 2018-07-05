package designModel.decorateModel;

import java.io.Console;

/**
 * Person类
 */
class Person {
    public Person() {

    }
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("装扮的" + name);
    }
}
