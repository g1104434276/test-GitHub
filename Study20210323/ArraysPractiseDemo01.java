package Study20210323;

import java.util.Arrays;

/*
题目:
请使用Arrays相关的API,将一个随机字符串中的所有字符升序排列,并倒序打印.
 */
public class ArraysPractiseDemo01 {
    public static void main(String[] args) {
        String str = "lsjfiowsjndflksjfaoi656sdf656+ds4f54";

        //如何进行升序排列: sort
        //必须是一个数组,才能用Arrays.sort方法
        //String --> 数组 ,用toCharArray

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        //倒叙遍历  chars.forr
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(" "+chars[i]+" ");
        }

    }
}
