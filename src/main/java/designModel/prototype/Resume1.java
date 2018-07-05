package designModel.prototype;

public class Resume1 implements Cloneable {
    private String name;
    private String sex;
    private String age;
    public WorkExperience workExperience;
    public Resume1(String name) {
        this.name = name;
        workExperience = new WorkExperience();//最开始的时候，这里报空指针异常，那是因为没有初始化workExperience
    }
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }
    public void setWorkExperience(String timeArea, String company) {

        workExperience.setWorkDate(timeArea);
        workExperience.setCompany(company);
    }
    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + workExperience.getWorkDate() + " " + workExperience.getCompany());
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    /**
     * Cloneable中的clone()方法是这样：
     * 如果字段是值类型，则对该字段执行逐位复制，
     * 如果字段是引用，则复制引用，但是不复制引用的对象；
     * 因此，原始对象及其复本引用同一对象
     */
}
