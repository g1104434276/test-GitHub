package Study20210306;

import java.util.ArrayList;

/*
题目:
定义4个学生对象,添加到集合,并遍历

思路:
1.自定义 Student 学生类,四个部分
第一 :所有的成员变量都用private
第二 :要有无参构造
第三 :要有全参构造
第四 :要写get set方法
2.创建一个集合,用来存储学生对象.泛型:<Student>
3.根据类来创建学生对象.
4.将四个学生对象添加到集合中: add
5.遍历集合: for ,size ,get
 */
public class ArrayListStudentDemo02 {
    public static void main(String[] args) {
        ArrayList<StudentDemo02> list = new ArrayList<>();

        StudentDemo02 one = new StudentDemo02("洪七公",20);
        StudentDemo02 two = new StudentDemo02("欧阳锋",21);
        StudentDemo02 three = new StudentDemo02("黄药师",22);
        StudentDemo02 four = new StudentDemo02("段智兴",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合: list.fori
        for (int i = 0; i < list.size(); i++) {
            StudentDemo02 stu = list.get(i);
            System.out.println("第" + i + "个学生的姓名是:" + stu.getName() + ".  他的年龄是:" +stu.getAge() );
        }

    }
}
