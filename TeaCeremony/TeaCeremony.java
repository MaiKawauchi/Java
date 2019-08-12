class HotWater{
    HotWater(){System.out.println("Hot water is ready");}
}//end of the Hotwater class

class Tea extends HotWater{
    Tea(){System.out.println("Tea is in a cup");}
}//end of the Tea class

class Spin{
    Spin(){System.out.println("Spin the cup");}
}//end of the Spin class

public class TeaCeremony{
    private Tea t = new Tea();
    private Spin c = new Spin();
    public TeaCeremony(){System.out.println("Enjoy a tea ceremony!");}
    public static void main(String[] args){
        TeaCeremony t = new TeaCeremony();
    }
}//end of the Teaceremony class
