/*
 *中北大学软件学院GL的练习代码 2020-2025
 */
package lx01220749;

/**
 *字符串的常量池
 * @author  GL
 * @version 1.0 
 * 程序当中直接写上的双引号字符串,就在字符串常量池中.
 * 
 */
public class Demo10StirngPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "abc";
		
		char [] charArray = {'a','b','c'};
		String str3 = new String(charArray);
		
		System.out.println(str1 == str2);//true
		System.out.println(str2 == str3);//false
		System.out.println(str1 == str3);//false
	}

}
