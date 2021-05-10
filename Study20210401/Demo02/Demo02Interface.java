package Study20210401.Demo02;
/*
1. 接口的默认方法.可以通过接口实现类对象.直接调用.
2. 接口的默认方法.也可以被接口实现类进行覆盖重写.
3. 接口的默认方法.可以拼接函数模型

 */
public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefauletA a = new MyInterfaceDefauletA();
        a.methodAbs();//调用抽象对象方法,实际运行的是右侧实现类.

        //调用默认方法,如果实现类当中没有,会向上找接口的.
        a.methodDefault();
        System.out.println("===================");

        MyInterfaceDefauletB b = new MyInterfaceDefauletB();
        b.methodAbs();
        b.methodDefault();//实现类B覆盖重写了接口的默认方法
    }
}
