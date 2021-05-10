package Study20210509.Demo01;
/*
final 关键字代表最终,不可改变的.

常见的四种方法:
1. 可以用来修饰一个类
2. 可以用来修饰一个方法
3. 还可以用来修饰一个局部变量
4. 还有可以用来修饰一个成员变量


 */
public class Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);//10
        num1=20;
        System.out.println(num1);//20

        //一旦使用final用来修饰局部变量,那么这个变量就不能进行更改.
        //一次赋值终身不变
        final int num2 = 200;
        System.out.println(num2);
        /*num2 = 300; (错误写法不能改变)
        System.out.println(num2);*/
//        num2 = 200;//错误写法!

        //正确写法!只要保证唯一一次赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说,不可变说的是变量当中的数据不可变
        //对于引用类型来说,不可变说的是变量当中的地址值不可改变

        Student student = new Student("赵丽颖");
        System.out.println(student);
        System.out.println(student.getName());
        student = new Student("霍建华");
        System.out.println(student);
        System.out.println(student.getName());

        final Student student1 = new Student("高圆圆");//高圆圆
        //错误写法final类型的引用类型变量,其中的地址不可改变.
//        student1 = new Student("赵又廷");
        student1.setName("高圆圆圆圆圆");
        System.out.println(student1.getName());//高圆圆圆圆圆
    }

}
