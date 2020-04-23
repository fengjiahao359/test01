package cn.itcase1.demo03;

/**
 * @author:fjh
 * @Date: 16:37
 */
public class Hero {
    private String name;
    private int age;
    private Weapon weapon;
   private Skill skill;
    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon, Skill skill) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.skill=skill;

    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void attack(){
        System.out.println("年龄"+age+"的"+name+"拿这"+weapon.getCode()+"去攻击敌人");
        skill.use();


    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
