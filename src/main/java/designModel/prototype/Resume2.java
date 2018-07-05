package designModel.prototype;

public class Resume2 implements Cloneable{
    private String name;
    private String sex;
    private String age;
    public WorkExperience1 workExperience;
    public Resume2(String name) {
        this.name = name;
        this.workExperience = new WorkExperience1();//最开始的时候，这里报空指针异常，那是因为没有初始化workExperience
    }
    private Resume2(WorkExperience1 workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience1)workExperience.clone();
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
        Resume2 obj = new Resume2(this.workExperience);
        obj.name = this.name;
        obj.age = this.age;
        obj.sex = sex;
        return obj;
    }
}

