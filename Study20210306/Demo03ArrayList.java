package Study20210306;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度是可以随意发生变化

对于ArrayList 来说,有一个尖括号<E>代表泛型.
泛型也就是装在集合当中的所有元素,都看都是统一的什么类型.
注意:泛型只能是引用类型,不能是基本类型

注意事项:
对于ArrayList集合来说,直接打印得到的不是地址值,而是内容.
如果内容是空,得到的是空的中括号: []
 */
public class Demo03ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合,集合的名称是iLis,里面装的全都是Stirng 字符串类型的数据
        //备注:从JDK 1.7开始,右侧的尖括号内部可以不写内容,但是<>本身还是要写的.
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合当中添加数据,需要用到add方法
        list .add("赵丽颖");
        System.out.println(list);//赵丽颖
        list.add("迪丽热巴");
        list.add ("古力娜扎");
        list.add("马儿扎哈");
        System.out.println(list);

        /*
        list.add(100);//错误写法!创建的时候简括好泛型已经说了是字符串,添加进去的元素就必须都是字符串才行
         */
    }

}
