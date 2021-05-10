package Study20210509.Demo05;
/*
如果接口当中的实现类 (或者父类的子类) 只需使用唯一的一次.
那么这种情况下就可以省略掉该类的定义.而改为使用匿名内部类.

匿名内部类的定义格式:
接口名称 对象名 = new 接口名称(){
    //覆盖重写接口当中所有的抽象方法
};


 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        //使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法!");
            }
        };
        obj.method();
    }
}
