package cn.itcase.demo06;

/**
 * @author:fjh
 * @Date: 18:14
 */
public class Rectangle implements Shape2D {
      double chang;
      double kuan;

   public Rectangle(double chang,double kuan){
        this.chang=chang;
        this.kuan=kuan;
   }
    public void grith() {
        System.out.println((chang+kuan)*2);
    }

    @Override
    public void area() {
        System.out.println(chang*kuan);
    }
}
