package Study20210306;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");

        //遍历集合
        /*
            迪丽热巴
            古力娜扎
            马儿扎哈
         */
        for (int i = 0; i<list.size(); i++){   //快捷创建: list.fori
            System.out.println(list.get(i));
        }
    }
}
