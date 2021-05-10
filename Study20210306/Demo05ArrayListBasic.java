package Study20210306;

import java.util.ArrayList;

/*
如果希望向集合 ArrayList 当中存储基本类型数据,必须使用基本类型对应的"包装类".

基本类型      包装类(引用类型,包装类都位于java.lang包下)
byte        Byte
int         Short
long        Integer     [特殊]
float       Long
double      Float
char        Character   [特殊]
boolean     Boolean

把Integer 当成 int 程序是不会报错的 反过来就不可以因为
从JDK1.5开始,支持自动装箱,自动拆箱
自动装箱: 基本类型 --> 包装类型
自动拆箱: 包装类型 --> 基本类型
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //下面注释为错误写法,泛型只能是引用类型,集合引用的是地址值而基本类型是没有地址值
    /*
    ArrayList<int> listB = new ArrayList<>();
    */
        ArrayList <Integer> listB = new ArrayList<Integer>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB);

        int num = listB.get(1);
        System.out.println("一号元素是: " + num);
    }



}
