package lx01220749;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion [] array = new Persion[3];
		
		Persion one = new Persion("µÏÀöÈÈ°Í",20);
		Persion tow = new Persion("¹ÅÁ¦ÄÈÔú",18);
		Persion three = new Persion ("Âí¶ùÔú¹ş",33);
		
		array[0] = one;
		array[1] = tow;
		array[2] = three;
		
		System.out.println (array[0]);
		System.out.println (array[1]);
		System.out.println (array[2]);
		
		System.out.println(array[1].getName());
		

	}

}
