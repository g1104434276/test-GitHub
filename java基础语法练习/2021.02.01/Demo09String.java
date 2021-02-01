/*
 *中北大学软件学院GL的练习代码 2020-2025
 */
package lx01220749;


/**
 *
 * @author  GL
 * @version 1.0 
 * java.lang.Stirng类代表字符串类
 * 程序当中所有双引号字符串,都是String类的对象(就算没有new,也照样是.)
 * 
 * 字符串的特点:
 * 1.字符串的特点永不可变,字符串是常量,他们的值在创建之后不能更改.[重点]
 * 2.正是因为字符串不可改变,所以字符串是可以共享使用的.
 * 3.字符串效果上相当于char[]字符数组,但底层原理是byte[]字节数组.
 * 
 * 创建字符串的常见3+1种方式
 * 三种构造方法:
 * public String ():创建一个空白字符串,不含有任何内容.
 * public String (char[] array):根据字符数组的内容来创建对应字符串.
 * pbulic String (byte[] array):根据字节数组的内容,来创建对应的字符串.
 * 一种直接创建
 * String str = "Hello";
 * 注意直接写上字符串就是字符串对象
 */
public class Demo09String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//使用空参构造
		String str1 = new String();//小括号留空说明什么都没有
		System.err.println("第一行字符串:" + str1);
		
		//根据字符数组创建字符串
		char[] charArray = {'A','B','C'};
		String str2 = new String (charArray);
		System.out.println("第二个字符串:"+ str2);
		
		//根据字节数组创建字符串
		byte [] byteArray = {97,98,99};
		String  str3 = new String(byteArray);
		System.out.println("第三个字符串:" + str3);
		
		//直接创建
		String str4 = "Hello";
		System.out.println("第四个字符串:"+str4);
		
	}

}
