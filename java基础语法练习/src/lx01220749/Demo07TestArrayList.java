package lx01220749;
//随机生成6个1-33之间的随机整数
import java.util.ArrayList;
import java.util.Random;

public class Demo07TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建Random 对象
		Random random = new Random();
		//创建ArrayList 对象
		ArrayList<Integer> list = new ArrayList<> (); 
		
		//添加随机数集合
		for(int i=0; i<6; i++) {
			list.add(random.nextInt(33) + 1); 
		}
		//遍历集合输出
			System.out.println(list);
		
	}

}
