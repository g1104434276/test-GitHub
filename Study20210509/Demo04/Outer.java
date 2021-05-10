package Study20210509.Demo04;
/*
如果一个类是定义在一个方法内部的,那么这就是一个局部内部类.
"局部":只有当前属性的方法才能使用它,出了这个方法外面就不能用了.

定义格式:
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称(参数列表){
        class 内部类名称 {
            //...
        }
    }
}

小结一下类的权限修饰符:
定义一个类的是否,权限修饰符规则:
1. 外部类      public / (default)
2. 局部内部类    public / protected / (default) / private
3. 局部内部类    什么都不能写 (效果和(default)不一样)

public > protexted > (defatlt) > private
 */
public class Outer {

    public void methodOuter() {
        //========================================
        class Inner {//局部内部类
            int num = 10;

            public void methodInner() {
                System.out.println(num);//10
            }
        }
        //========================================
            Inner inner = new Inner();
            inner.methodInner();

    }
}
