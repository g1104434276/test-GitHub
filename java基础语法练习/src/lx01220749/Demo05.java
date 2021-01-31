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
			System.out.println("请输入数字(1-100):");

			int guessNum = sc.nextInt();
			i++;
			if(randomNum > guessNum) {
				System.out.println("你猜的数字偏小了");
			}
			else if(randomNum < guessNum) {
				System.out.println("你猜的数字偏大了");
			}
			else {
				System.out.println("数字正确,你共猜了" + i +"次");
			    break;
			}
		}
		System.out.println("游戏结束.");

	}

}
