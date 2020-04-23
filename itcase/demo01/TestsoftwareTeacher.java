package cn.itcase.demo01;

/**
 * 软件课程
 *
 * @author:fjh
 * @Date: 16:17
 */
public class TestsoftwareTeacher {
    public static void main(String[] args) {
         softwareTeacher softwareTeacher=new softwareTeacher(1002, "魏总","男", 24,"博士","教我们这群菜鸡JAVA");
          softwareTeacher.startWork("9点");
          softwareTeacher.offWork("晚上8点");
          softwareTeacher.teach("JAVA");
           softwareTeacher.teacherProcedure();

    }
}
