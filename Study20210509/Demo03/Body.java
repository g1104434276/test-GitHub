package Study20210509.Demo03;

public class Body {//外部类

    public class Heart {//成员内部类

        public void beat (){
            System.out.println("内部类的方法!");
            System.out.println("我叫:" + name);
        }

    }
    //外部类的成员变量
    private String name;


    public void methodVody(){
        System.out.println("外部类的方法!");

        //实名对象
        Heart heart = new Heart();
        heart.beat();

        //匿名对象
        new Heart().beat();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
