package Study20210401.Demo07;

public interface MyinterfaceB {
    //错误写法!接口不能有静态代码块
//    static {
//
//    }
    //错误写法!接口不能有构造方法
//    public Myinterface(){
//
//    }
    public abstract void methodB();
    public abstract void methodAbs();

    public default void emthodDefault(){
        System.out.println("默认方法BBB");
    }

}
