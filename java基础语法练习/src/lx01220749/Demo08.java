package lx01220749;
//创建字符串的3+1种
/*
三种构造方法
public String ();
public String (char[] array);字符数组
public String (byte [] array);字节数组
直接创建
注意! 直接写上双引号,就是字符串对象

 */

public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用空参构造
		String str1 = new String();
		System.out.println("第一个字符串:" + str1);
		
		//根据字符数组创建字符串
		char [] charArray = { 'A' , 'B' , 'C'};
		String str2 = new String(charArray);
		System.out.println("第二 个字符串:" + str2);
		
		//根据字节数组创建字符串
		byte[] byteArra = {97 ,98 ,99};
		String str3 = new String(byteArra);
		System.out.println("第三 个字符串:" + str3);
		
		//直接创建
		String str4 = "HelloWord";
		System.out.println("第四 个字符串:" + str4);
		
		

	}

}
