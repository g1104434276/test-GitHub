package lx01220749;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int randomNum = r.nextInt(100)+1;
		Scanner sc = new Scanner(System.in);
		int i = 0;		

		
		while(true) {
			System.out.println("����������(1-100):");

			int guessNum = sc.nextInt();
			i++;
			if(randomNum > guessNum) {
				System.out.println("��µ�����ƫС��");
			}
			else if(randomNum < guessNum) {
				System.out.println("��µ�����ƫ����");
			}
			else {
				System.out.println("������ȷ,�㹲����" + i +"��");
			    break;
			}
		}
		System.out.println("��Ϸ����.");

	}

}
