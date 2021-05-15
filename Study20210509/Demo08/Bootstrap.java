package Study20210509.Demo08;

import Study20210509.red.OpenMode;

/*
场景说明:
    红包发出去以后,所有人都有红包,大家抢完了之后,最后一个红包给群主自己.
大多数代码都是现成的,我们需要就是填空题.
我们自己要做的事情有:
    1. 设置一下程序的标题,通过构造方法的字符串
    2. 设置群主的名称
    3. 设置分发策略: 平均,还是随机?
红包分发的策略:
    1.随机红包 (平均) : totalMoney / totalCount, 余数放到最后一个红包当中.
    2.手气红包 (随机) : 最少一分钱,最多不超过平均数的2倍.应该是越发越少.
 */
public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("高立做的红包");
        //设置群主名称
        red.setOwnerName("高立");

//        //普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        //随机红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);

    }

}
