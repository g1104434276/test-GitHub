package Study20210401.Demo04;
/*
问题描述:
我们需要抽取一个公共方法,用来解决两个默认方法之间代码重复的问题.
但是这个公共方法不应该让实现类使用,应该私有化.

解决方案:
从java 9 开始,接口当中允许定义私有方法
1.普通私有方法,解决多个默认方法之间重复代码问题
格式:
private  返回值类型 方法名称 (参数列表) {
    方法体
}
2.静态私有方法,解决多个静态方法之间重复代码问题
private static 返回值类型 方法名称 (参数列表) {
    方法体
}
 */
public interface MyInterfacePrivateA {

    public default void methodDefault1 () {
        System.out.println("默认方法一");

    }

    public default void methodDefault2 () {
        System.out.println("默认方法二");

    }

    //此版本为JAVA 1.8 版本所以会报错
/*    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
   }*/



        }
