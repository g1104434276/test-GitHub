package lx01220749;

import java.util.ArrayList;
import java.util.Random;

public class Demo07ArrayListReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> bigList = new ArrayList<>();
		Random r = new Random();
		
		for(int i = 0; i<20; i++) {
			int num = r.nextInt(100)+1;
			bigList.add(num);
		}
		System.out.println(bigList);
		ArrayList<Integer> smallList = getSmallList(bigList);
		System.out.println(smallList);
			
	}
	public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
		//创建一个小集合
		
		ArrayList<Integer> smallList = new ArrayList<>();
		for(int i= 0 ; i<bigList.size();i++ ) {
			int num = bigList.get(i);
			if(num % 2 ==0) {
				smallList.add(num);
			}
		}
		
		
		return smallList;
	}
	

}
