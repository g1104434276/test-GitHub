package lx01220749;

import java.util.Scanner;


//只有java.lang包下的类不需要导包 其他包都需要import语句
/*
 * 1.导包
 * 2.创建
 * 3.使用
 * 
 * */

public class demo0701 {
	public static void main (String[] args) {
		//System.in从键盘输入
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("输入的int数字为:" + num);
		
		String str =sc.next();
		System.out.println("输入的字符串是:" + str );
		
		
	}

}
