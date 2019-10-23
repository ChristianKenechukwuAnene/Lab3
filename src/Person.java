public class Person {    //Attributes
    private String name;
    private int age;

    public Person() {  //No Argument Constructor
        this.name="unknow";
        this.age=0;
    }
    public Person(String name, int age){  //Multiple Argument
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return ("The person's name is " + name + " and their age is"+ age);
    }
}