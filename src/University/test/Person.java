package University.test;

public class Person {
    public String name;
    public int age;


    public Person(String name, int age) {
        this.name = name;
        if (age>0) {
            this.age = age;
        }
        else {
            System.out.println ("Enter a valid number!");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public  String reverseName(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

}
