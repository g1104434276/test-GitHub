package lx01220749;

import java.util.Scanner;

public class Demo01Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion one = new Persion();
		one.setName("刘瑶瑶");
		one.showName();
		System.out.println("=======================");
		
		//匿名对象   只能使用唯一的一次
		new Persion().setName("高远");
		new Persion().showName();
		System.out.println(new Persion());
		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		int num = new Scanner(System.in).nextInt();
		System.out.println("第一次输入的是:" + num );

		//使用匿名对象来传参
		
		methodParam(new Scanner(System.in));
		

	}
	
	
	public static void methodParam(Scanner sc) {
		int i = sc.nextInt();
		System.out.println("第二次输入的是:" + i );
	}

}
