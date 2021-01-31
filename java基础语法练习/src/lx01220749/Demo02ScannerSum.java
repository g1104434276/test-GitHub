package lx01220749;

import java.util.Scanner;
/*
 * 键盘输入并求出和值
 * 
 * 
 * 
 * */



public class Demo02ScannerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入两个数字:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum =num1 + num2;
		System.out.println("从键盘输入的两个数字的和为:" + sum);

	}

}
