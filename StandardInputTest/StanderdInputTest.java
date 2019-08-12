import java.io.*;

public class StanderdInputTest{
    public static void main(String[] args){

        try{
            BufferedReader charStream;
            charStream = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What is your name?");
            String name = charStream.readLine();
            System.out.println("What is your age?");
            String ageString = charStream.readLine();

            int age = Integer.parseInt(ageString);
            System.out.println("Hi, " + name + " you are " + age + " years old.");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
