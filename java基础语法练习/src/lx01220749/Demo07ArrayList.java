package lx01220749;
import java.util.ArrayList;

public class Demo07ArrayList {

	/*
	 * ����ĳ��Ȳ����Է����ı�
	 * ��ArrayList���ϵĳ����ǿ�������仯��.
	 * 
	 * ����Arraylist��˵,��һ��������<E>������
	 * ����: Ҳ����װ�ڼ����е�����Ԫ��,ȫ����ͳһ��ʲô����
	 * ע��: ����ֻ������������,�����ǻ�������
	 * 
	 * ע������
	 * ����ArrayList ���ϰ���˵ ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ,��������
	 * ��������ǿ�,�õ����ǿյ������� []
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<> ();
		System.out.println(list);//[]
		
		//�񼯺ϵ������һЩ����,��Ҫ�õ�add����.
		list.add("����ӱ");
		System.out.println(list);
		list.add("�����Ȱ�");
		list.add("�������");
		System.out.println(list);

	}

}
