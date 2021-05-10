package Study20210306;

import java.util.ArrayList;
import java.util.Random;

/*
题目:
生成6个1~33之间的随机数,添加到集合,并遍历集合.

思路:
1.需要存储6个数字,创建一个集合,<Integer>泛型
2.产生随机数需要用到Random
3.用循环6次,来产生6个随机数字:for循环
4.循环内调用 r.nextInt(int n),参数33,0~32,整体加1才是1~33
5.把数字添加到集合中:add
6.遍历集合: for ,size ,get
 */

public class ArrayListRanDom01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        //遍历集合
        for (int i = 0; i < 6; i++) {
            System.out.print( " " + list.get(i) + " ");
        }
    }
}
