package cn.itcase.demo01;

/**
 * 抽象类教室
 *
 * @author:fjh
 * @Date: 15:31
 */
public abstract class Teacher {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String education;
    private String teacherTitle;


    public Teacher(int id, String name, String sex, int age, String education, String teacherTitle) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.education = education;
        this.teacherTitle = teacherTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getTeacherTitle() {
        return teacherTitle;
    }

    public void setTeacherTitle(String teacherTitle) {
        this.teacherTitle = teacherTitle;
    }
    public void startWork(String time){
        System.out.println(this.name+time+"上班");
    }
    public void offWork(String time){
        System.out.println(this.name+time+"上班");
    }
    public void teach(String course){
        System.out.println(this.name+"教"+course);
    }
    public abstract void teacherProcedure();


}
