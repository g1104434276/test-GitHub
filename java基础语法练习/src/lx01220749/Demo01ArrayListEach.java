package lx01220749;

import java.util.ArrayList;

public class Demo01ArrayListEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<> ();
		list.add("�����Ȱ�");
		list.add("��������");
		list.add("�������");
		
		for(int i= 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
