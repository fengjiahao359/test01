package cn.itcase.demo01;

/**
 * @author:fjh
 * @Date: 15:53
 */
public class TestMusicTeacher {
    public static void main(String[] args) {
        MusicTeacher musicTeacher=new MusicTeacher(1001,"朗朗","男",28,"博士","音乐老师");


        musicTeacher.startWork("早上九点");
        musicTeacher.offWork("下午5点");
        musicTeacher.teach("音乐课");
        musicTeacher.teacherProcedure();

    }
}
