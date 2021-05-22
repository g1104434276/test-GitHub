package Study20210428.Demo02;

public class InterClass {
    public static void main(String[] args) {
        //外部类名称.内部类名称 对象名 = new 外部类名称().内部类名称();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
