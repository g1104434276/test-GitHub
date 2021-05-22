package Study20210322;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室,这是静态的东西,应该通过类名称进行调用
        Student.room = "101教室";

        Student one = new Student("郭靖",20);
        System.out.println("one的姓名:" + one.getName());//one的姓名:郭靖
        System.out.println("one的年龄:" + one.getAge());//one的年龄:20
        System.out.println("one的教室:" + Student.room);//one的教室:101教室
        System.out.println("==========================");

        Student two = new Student("黄蓉",18);
        System.out.println("two的姓名:" + two.getName());//two的姓名:黄蓉
        System.out.println("two的年龄:" + two.getAge());//two的年龄:18
        System.out.println("two的教室:" + Student.room);//two的教室:101教室
    }
}
