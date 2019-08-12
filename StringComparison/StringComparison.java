public class StringComparison{
    public static void main(String[] args){
        String[] data = {"S1000001 Aizu Nuri 1996",
                         "s1000001 AIZU NURI 1996"};
        data[0] = data[0].toUpperCase();
        data[1] = data[1].toUpperCase();
        boolean retVal;
        retVal = data[0].equals(data[1]);
        System.out.println("Returned Value = " + retVal);
    }
}
