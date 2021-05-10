package Study20210401.Demo02;
/*
从java 8 开始. 接口你允许定义默认方法.
public default 返回值类型 方法名称(参数列表){
    方法体
}

备注: 接口当中的默认方法可以解决接口升级问题.
 */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //抽象方法
//    public abstract void methodAbs2();

    //新添加的方法,改成默认方法
    public default void methodDefault(){
        System.out.println("这是一个新添加的默认方法");
    }



}
