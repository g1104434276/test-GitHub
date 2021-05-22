package Study20210428.Demo02;

public class Body {

    public class Heart {//成员内部类

        //内部类方法
        public void beat(){
            System.out.println("成员内部类");
            System.out.println("我叫:" + name);//正确写法
        }

    }

    //外部类的成员变量
    private String name;

    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法。");
        Heart heart = new Heart();
        heart.beat();
        //或者使用匿名对象 new Heart().beat();
    }

    public String getNeme() {
        return name;
    }

    public void setNeme(String name) {
        this.name = name;
    }
}
