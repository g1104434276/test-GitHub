package Study20210509.Demo01;
/*
当final关键字用来修饰一个方法的时候,这个方法就是最终方法.也就是不能被覆盖重写.
格式:
修饰符 final 返回值类型 方法名称(参数列表) {
    //方法体
}
注意事项:
对于类,方法来说abstract关键字和final关键字不能同时使用,因为矛盾.
 */
public abstract class Fu {
    public final void method (){
        System.out.println("父类方法执行!");
    }
    public /*final  (final和abstract矛盾不能同时使用)*/ abstract void methodAbs ();
}
