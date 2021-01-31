package lx01220749;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = methodReturn();
		int num = sc.nextInt();
		System.out.println("输入的数字为:" + num);
		
		

	}
	
	public static Scanner methodReturn() {
		
		return new Scanner(System.in);
	}

}
