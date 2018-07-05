package designModel.prototype;

/**原型模式
 * 所谓简历的复制，其实就是Cloneable接口的使用，以及调用clone()方法实现
 * 从一个对象再创建另一个可定制的对象，而且不需要知道任何创建的细节
 * 这就是克隆的，不重新初始化对象，二三十动态的获得对象运行时的状态
 */
public class ResumeCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * 简历的克隆，不涉及引用的复制，仅仅只是值的改变
         */
//        Resume a = new Resume("大鸟");
//        a.setPersonalInfo("男","29");
//        a.setWorkExperience("1998-2000","百度");
//
//        Resume b = (Resume)a.clone();
//        b.setWorkExperience("1998-2006","阿里");
//
//        Resume c = (Resume)a.clone();
//        c.setPersonalInfo("男","29");
        /**
         * 这就是浅复制
         * 浅复制，被复制的对象的所有变量都含有与原来的对象相同的值，
         * 而所有的对其他对象的引用，仍然指向原来的对象
         */
//        Resume1 a = new Resume1("大鸟");
//        a.setPersonalInfo("男","29");
//        a.setWorkExperience("1998-2000","百度");
//
//        Resume1 b = (Resume1)a.clone();
//        b.setWorkExperience("1998-2006","阿里");
//
//        Resume1 c = (Resume1)a.clone();
//        c.setPersonalInfo("男","29");
//
//        a.display();
//        b.display();
//        c.display();
        /**
         * 这就是深复制
         * 所谓深复制，就是把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象
         */
        Resume2 a = new Resume2("大鸟");
        a.setPersonalInfo("男","27");
        a.setWorkExperience("1998-2000","百度");

        Resume2 b = (Resume2)a.clone();
        b.setWorkExperience("1998-2006","阿里");

        Resume2 c = (Resume2)a.clone();
        c.setPersonalInfo("男","29");

        a.display();
        b.display();
        c.display();

    }
}
