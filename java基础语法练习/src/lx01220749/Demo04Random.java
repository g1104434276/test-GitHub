package lx01220749;
import java.util.Random;



public class Demo04Random {

	/*
	 * Random类用来生成随机数字.使用起来也是三个步骤
	 * 
	 * 1.导包
	 * import java.util.Random;
	 * 
	 * 
	 * 2.创建
	 * Random r = new Random();小括号当中留空即可
	 * 
	 * 
	 * 3.使用
	 * 获取一个随机的int 数字 (获取范围是所用范围, 有正负两种),nextInt();
	 * 获取一个随机的int 数字 (参数代表了范围,左闭右开区间)
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int num1 = r.nextInt();
		System.out.println("int范围内的随机数字是:" + num1);
		
		for(int i=1; i<10000 ; i++) {
		int num2 = r.nextInt(1000);
		System.out.println("第" +i+ "个随机数为:"+ (num2+1));
		}
		
		
		
		
		
		
		
		
		
		

	}

}
