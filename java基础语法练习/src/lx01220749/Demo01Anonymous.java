package lx01220749;

import java.util.Scanner;

public class Demo01Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion one = new Persion();
		one.setName("������");
		one.showName();
		System.out.println("=======================");
		
		//��������   ֻ��ʹ��Ψһ��һ��
		new Persion().setName("��Զ");
		new Persion().showName();
		System.out.println(new Persion());
		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		int num = new Scanner(System.in).nextInt();
		System.out.println("��һ���������:" + num );

		//ʹ����������������
		
		methodParam(new Scanner(System.in));
		

	}
	
	
	public static void methodParam(Scanner sc) {
		int i = sc.nextInt();
		System.out.println("�ڶ����������:" + i );
	}

}
