package Study20210306;
/*
定义一个数组,用来存储3个Person对象.

数组有空一个缺点:一但创建程序运行期间长度不可以发生改变,为了解决这个问题可以使用ArrayList集合
 */

public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组
        Demo02ArrayPerson [] array = new Demo02ArrayPerson[3];
        System.out.println(array[0]);//null

        Demo02ArrayPerson one = new Demo02ArrayPerson("迪丽热巴",18);
        Demo02ArrayPerson two = new Demo02ArrayPerson("古力娜扎",28);
        Demo02ArrayPerson three = new Demo02ArrayPerson("马儿扎哈",38);

        //将one当中的地址值赋值到数组0号位置中
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//Study20210306.Demo02ArrayPerson@1b6d3586
        System.out.println(array[1]);//Study20210306.Demo02ArrayPerson@4554617c
        System.out.println(array[2]);//Study20210306.Demo02ArrayPerson@74a14482

        Demo02ArrayPerson person = array[1];
        System.out.println(person.getName());//古力娜扎
        System.out.println(array[1].getName());//古力娜扎
        System.out.println(two.getName());//古力娜扎

    }
}
