package Study20210517.Demo02;

import java.util.Objects;

public class ObjectsGl {
    public static void main(String[] args) {
        String s1 = "abc";
        //String s1 = null;
        String s2 = "abc";
        //bollean b =s1.equals(s2);//NullPointerException null 是不能调用方法的,就会抛出空指针异常.
        //System.out.printin(b);
        /*
        Objects类的equals方法:对两个对象进行比较,防止空指针异常
        public static bollean equals(Object o ,Object b){
        return (a == b) || (a != null&&o.equals(b));
        }
         */
        boolean b2 = Objects.equals(s1,s2);
        System.out.println(b2);
    }
}
