package lx01220749;
//�������6��1-33֮����������
import java.util.ArrayList;
import java.util.Random;

public class Demo07TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Random ����
		Random random = new Random();
		//����ArrayList ����
		ArrayList<Integer> list = new ArrayList<> (); 
		
		//������������
		for(int i=0; i<6; i++) {
			list.add(random.nextInt(33) + 1); 
		}
		//�����������
			System.out.println(list);
		
	}

}
