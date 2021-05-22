package Study20210331.Demo04;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("成员A",0);
        Member tow = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();
        one.show();
        tow.show();
        three.show();
        System.out.println("========================");

        //群主一共发20块钱,分成3个红包
        ArrayList<Integer> redList = manager.send(20,3);

        //三个普通成员收红包
        one.receive(redList);
        tow.receive(redList);
        three.receive(redList);

        System.out.println("========================");
        manager.show();//  100-20=80
        // 6,6,8随机分给8个人
        one.show();
        tow.show();
        three.show();




    }
}
