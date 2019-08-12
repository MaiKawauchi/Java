interface Shape{
    public double area();
    public double value();
}

class Cube implements Shape{
    int x = 10;
    public double area(){
        return (6*x*x);
    }
    public double value(){
        return (x*x*x);
    }
}
abstract class CubePlus implements Shape{
    int x = 20;
    public double area(){
        return (6*x*x);
    }
    public double value(){
        return (x*x*x);
    }
}

public class TestShape{
    public static void main(String[] args){
        Cube c1 = new Cube();
        //CubePlus c2 = new CubePlus();
        System.out.println(+ c1.area());
        System.out.println(+ c1.value());
        // System.out.println(+ c2.area());
        //System.out.println(+ c2.value());
    }
}
