package cn.itcase.demo01;

/**
 * @author:fjh
 * @Date: 15:52
 */
public class softwareTeacher extends Teacher {
    public softwareTeacher(int id, String name, String sex, int age, String education, String teacherTitle) {
        super(id, name, sex, age, education, teacherTitle);
    }

    @Override
    public void teacherProcedure() {
        System.out.println("软件教师，我正在上课");
    }
}
