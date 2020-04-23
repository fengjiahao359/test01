package cn.itcase1.demo03;

/**
 * @author:fjh
 * @Date: 16:39
 */
public class DemoTest {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setAge(20);
        hero.setName("¸ÇÂ×");
        Weapon weapon = new Weapon("ÎÞ¾¡Ö®ÈÐ");
        hero.setWeapon(weapon);



        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu biu Biu biubidsa");
            }
        });
       hero.attack();
    }
}
