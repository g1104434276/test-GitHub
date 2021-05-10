package Study20210306;

public class Demo02ArrayPerson {
    private int age;
    private String name;

    public Demo02ArrayPerson() {

    }
    public Demo02ArrayPerson(String name,int age){
        this.name = name ;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
