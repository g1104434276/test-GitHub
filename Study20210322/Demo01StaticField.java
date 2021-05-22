package Study20210322;
/*
如果一个成员变量使用了static关键字,那么这个变量不再属于对象自己,而是属于所在的类.多个对象共享一份数据.
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student ("郭靖", 19);
        one.room = "101教室";
        System.out.println("姓名:" + one.getName()
                + "  年龄:" + one.getAge() + " 教室:" + one.room + " ID是:" + one.getId());//姓名:郭靖  年龄:19 教室:101教室 ID是:1
        Student two = new Student ("黄蓉", 16);
        System.out.println("姓名:" + two.getName()
                + "  年龄:" + two.getAge() + " 教室:" + two.room + " ID是:" + two.getId());//姓名:黄蓉  年龄:16 教室:101教室 ID是:2

    }
}
