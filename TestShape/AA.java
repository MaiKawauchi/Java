class AA{
    int i;
    void m1(){
        m2(i);
        System.out.println("i= " +i);
    }
    void m2(int i){
        i = 5;
    }
    public static void main(String[] args){
        AA o1 = new AA();
        o1.m1();
        System.out.println(args.length);
    }
}
