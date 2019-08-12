abstract class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){return name;}
    public abstract String greetingAtLunch();
}//end of Person class

class EnglishPerson extends Person{
    public EnglishPerson(String name){super(name);}
    @Override
    public String greetingAtLunch(){
        return (getName() + ": Enjoy your meal.");
    }
}//end of Englishperson

class JapanesePerson extends Person{
    public JapanesePerson(String name){super(name);}
    @Override
    public String greetingAtLunch(){
        return (getName() + ": Itadaki masu.");
    }
}//end of Japaneseperson

class InternatinalGreetings{
    public static void main(String[] args){
        Person[] x = {new EnglishPerson("Peter"),
                      new JapanesePerson("MIchio")};
        greeting(x[1]);
        greeting(x[0]);
    }
    static void greeting(Person a){
        System.out.println("This is " + a.greetingAtLunch());
    }
}
