package cn.enmuone;

/**
 * @author:fjh
 * @Date: 19:08
 */
public class MyStack {
    int lengh=0;

    public void set() throws MystackException {
        lengh++;
        if(lengh==10)
        {
            throw new MystackException("�������������ܼ��������ˣ�");
        }
        System.out.println(lengh);
    }
}
