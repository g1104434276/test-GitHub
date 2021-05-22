package Study20210517.Demo02;

import java.util.ArrayList;

public class Equals {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类,所以可以使用Object类的equals方法
        equals方法源码:
        public bollean equals(Object obj){
            return (this == obj);
        }
        参数:
            Object obj:可以传递任意的对象
            == 比较运算符,返回的是一个布尔值, true false
            基本数据类型:比较的是值
            引用数据类型比较的是两个对象的地址值
            this是谁?那个对象调用的方法,方法中的this就是拿个对象;p1调用的equals方法所以this就是p1
            obj是谁?传过来的参数p2
            this==obj --> p1==p2

         */
        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",18);
        System.out.println("p1" + p1);//p1Student20210517.Demo02.Person@34a245ab
        System.out.println("p2" + p2);//p2Student20210517.Demo02.Person@7cc355be

//        p1=p2;//把p2的地址值赋值给p1
        ArrayList<String> list = new ArrayList<>();
        boolean a = p1.equals(list);

        boolean c = p1.equals(null);

        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
