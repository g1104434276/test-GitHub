package lx01220749;
import java.util.Random;



public class Demo04Random {

	/*
	 * Random�����������������.ʹ������Ҳ����������
	 * 
	 * 1.����
	 * import java.util.Random;
	 * 
	 * 
	 * 2.����
	 * Random r = new Random();С���ŵ������ռ���
	 * 
	 * 
	 * 3.ʹ��
	 * ��ȡһ�������int ���� (��ȡ��Χ�����÷�Χ, ����������),nextInt();
	 * ��ȡһ�������int ���� (���������˷�Χ,����ҿ�����)
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int num1 = r.nextInt();
		System.out.println("int��Χ�ڵ����������:" + num1);
		
		for(int i=1; i<10000 ; i++) {
		int num2 = r.nextInt(1000);
		System.out.println("��" +i+ "�������Ϊ:"+ (num2+1));
		}
		
		
		
		
		
		
		
		
		
		

	}

}
