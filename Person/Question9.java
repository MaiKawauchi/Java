class Person{
    private String name;
    public Person(String name){ //constractre
        this.name = name;
    }
    public String intoroduction(){
        return "I am " + name + ".";
    }
}

class Student extends Person{
    private String id;
    public Student(String name, String id){
        super(name);
        this.id = id;
    }
    public String intoroduction(){
        return super.intoroduction() + "My university ID is " + id + ".";
    }
}
public class Question9{
    public static void main(String[] args){
        m(new Person("Tanaka"));
        m(new Student("Saito","s1250110"));
    }
    public static void m(Person x){
        System.out.println(x.intoroduction());
    }
}
