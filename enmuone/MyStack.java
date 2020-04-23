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
            throw new MystackException("数组已满，不能加入数据了！宝贝");
        }
        System.out.println(lengh);
    }
}
