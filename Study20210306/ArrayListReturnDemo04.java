package Study20210306;

/*
题目
用一个大集合存入20个随机数字,然后筛选其中的偶数元素,放到小鸡和当中.
要求使用定义的方法来实现筛选

分析:
1.需要创建一个集合,用来存储int数字: <Integer>
2.随机数字就用Random nextInt
3.循环20次,把随机数字放入大集合:for循环,add方法
4.定义一个方法,用来筛选.
筛选:根据大集合,筛选缝合要求的元素,得到小集合.
三要素
返回值类型: ArrayLyst小集合(里面元素个数不确定)
方法名称:getSamllList
参数列表:ArrayList大集合(装着20个随机数字)
5.判断(if)是偶数: num % 2 == 0;
6.如果是偶数,就放到小集合当中否则不放
 */

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturnDemo04 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt(100) + 1); //1~100
        }

        ArrayList<Integer> smallList = getSamllLst( bigList);

        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i) + " ");
        }
        System.out.println("偶数个数一共有:" + smallList.size() + "个");
    }

    //这个方法接收大集合参数,返回小集合结果
    public static ArrayList<Integer> getSamllLst(ArrayList<Integer> bigList) {
        //创建一个小集合,用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }

        return smallList;
    }
}