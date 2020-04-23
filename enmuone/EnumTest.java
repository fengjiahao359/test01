package cn.enmuone;

/**
 * @author:fjh
 * @Date: 15:44
 */
public class EnumTest {

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        try {
            myStack.set();
            myStack.set();
            myStack.set();
            myStack.set();
            myStack.set();
            myStack.set();
            myStack.set();
            myStack.set();
            myStack.set();
            myStack.set();
        } catch (MystackException e) {

            e.printStackTrace();
        }


    }




}
