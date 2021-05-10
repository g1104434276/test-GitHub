package Study20210415.Demo02;
/*
访问成员变量的两种方式:
1. 直接通过对象名称访问成员变量: 看等号左边是谁,优先用谁,没有则向上找.
2. 间接通过成员方法访问来访问成员变量: 看该方法属于谁,优先用谁,没有则向上找.

注意:子类变量不能覆盖重写,只有方法才可以覆盖重写
 */
public class MultiField {
    public static void main(String[] args) {
        //使用多态的写法,父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);//错误写法
        System.out.println("=========================");

        //子类没有覆盖重写就是: 10
        //子类入股空覆盖重写,就是子:20
        obj.showNum();


    }


}
