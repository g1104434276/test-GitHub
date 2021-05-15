package Study20210509.Demo06;

public class DemoMain {
    public static void main(String[] args) {
        //一个英雄角色
        Hero hero = new Hero();
        //为英雄起一个名字并设置年龄
        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon("多兰剑");
        //为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();//年龄为20的盖伦用多兰剑攻击对方!

    }
}
