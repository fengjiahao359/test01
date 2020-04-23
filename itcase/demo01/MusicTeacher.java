package cn.itcase.demo01;

/**
 * 音乐老师
 *
 * @author:fjh
 * @Date: 15:40
 */
public class MusicTeacher extends Teacher{


    public MusicTeacher(int id, String name, String sex, int age, String education, String teacherTitle) {
        super(id, name, sex, age, education, teacherTitle);
    }

    @Override
    public void teacherProcedure() {
        System.out.println("我是音乐老师我正在上课");
    }
}
