package cn.itcase.demo06;

/**
 * @author:fjh
 * @Date: 18:12
 */
public class Cricle implements Shape2D {

  double redius;
  public Cricle(double redius){
       this.redius=redius;
  }

    public void grith() {
        System.out.println(2*PI*this.redius);
    }


    public void area() {
        System.out.println(PI*redius*redius);
    }
}
