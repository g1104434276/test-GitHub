package Demo01;

import java.util.Random;
import java.util.Scanner;

/*
用代码模拟猜数字的小游戏

思路:
1.产生一个随机数字,并且产生不再变化.用Random的nextInt方法
2.需要键盘输入,所以用到了Scanner
3.获取键盘输入的数字,用Scanner当中的nextInt方法
4.已经得到了两个数字,判断(if)一下,
    如果太大了,提示太大了,并且重试
    如果太小了,提示太小了,并且重试
    如果猜中了,游戏结束.
5.重试就是再来一次,循环次数不确定,用while(true).

 */
public class Demo04Random {
    public static void main(String[] args) {
        int i = 0;
        Random r = new Random();
        int randomNum = r.nextInt(100)+1;//[1,100]
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入你猜测的数字:");
            int guessNum = sc.nextInt();//键盘输入猜测的数字
            i++;
            if (guessNum > randomNum){
                System.out.println("你猜测的太大了!");
            }else if (guessNum < randomNum){
                System.out.println("你猜测的太小了");
            }
            else{
                System.out.println("恭喜你,猜测正确!");
                System.out.println("一共猜了" + i + "次");
                break;//如果猜中了,不再重试,游戏结束!
            }
        }




    }
}
