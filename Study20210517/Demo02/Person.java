package Study20210517.Demo02;

import java.util.Objects;

public class Person {
    private String name ;
    private int age;

    public Person() {
    }

    /*
        直接打印对象的地址值没有意义,需要重写Object类的toString方法
        打印对象的属性(name,age)
     */

//    @Override
//    public String  toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*
        Object类的equals:方法默认比较的是两个对象的地址值,没有意义
        所以我们要重写equals方法,比较两个对象的属性(name,age)
        问题:
            隐含着一个多态
            多态的弊端:
                无法使用子类持有的内容(属性和方法)
                Object obbj = p2 = new Person ("李四",18);
                解决:可以使用向下转型(强转)把obj类型转换为Person
     */

//    public boolean equals(Object obj){
//        //增加一个判断,传递的参数obj如果是this本身,直接俄回true,提高程序效率
//        if(obj==this){
//            return true;
//        }
//        //增加一个判断传递的参数obj如果是null,直接返回false,可以提高程序效率
//        if(obj == null){
//            return false;
//        }
//        //增加一个判断防止类型转换异常(ClassCastException)
//        if(obj instanceof Person){
//            //使用线下转型,把obj转换为Person类型
//            Person p = (Person) obj;
//            //比较两个对象的属性,一个对象是this(p1),一个对象是p(obj->p2)
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass();使用反射判断o是否是Person类型  等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
//        }
//        //不是Person类型直接返回false
//        return false;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
