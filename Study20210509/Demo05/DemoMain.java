package Study20210509.Demo05;
/*
如果接口当中的实现类 (或者父类的子类) 只需使用唯一的一次.
那么这种情况下就可以省略掉该类的定义.而改为使用匿名内部类.

匿名内部类的定义格式:
接口名称 对象名 = new 接口名称(){
    //覆盖重写接口当中所有的抽象方法
};

对格式进行解析"new 接口名称(){...}进行解析"
1. new代表创建对象的动作
2. 接口名称就是匿名内部类需要实现哪个接口
3. {...}这才是匿名内部类的内容

另外还要注意几点问题:
1. 匿名内部类,在创建对象的时候,只能使用唯一一次.
2. 匿名对象,在调用方法的时候,只能调用唯一一次.
3. 如果希望同一个对象,调用多次方法,呢么必须个对象起个名字
4. 匿名内部类是省略了[实现类/子类名称] 但是匿名对象是省略了[对象名称]
强调: 匿名内部类和匿名对象不是一回事!!!
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        //使用匿名内部类
        MyInterface objA/*是一个匿名内部类使后面代码块没有名字,这就即使匿名内部类又是匿名方法*/ = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类A1实现了方法!");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类A2实现了方法!");
            }
        };
        objA.method1();
        objA.method2();

        //使用了匿名内部类,而且省略了对象名称,也是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类B1实现了方法!");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类B2实现了方法!");
            }
        }.method1();

        //因为匿名对象无法调用第二次方法,所以需要再创建一个匿名内部类的匿名对象(前者省略的是类名称,后者省略的是对象名称)
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类B1实现了方法!");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类B2实现了方法!");
            }
        }.method2();
    }
}
