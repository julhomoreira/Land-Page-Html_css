import java.util.Scanner;
import java.text.DecimalFormat;

public class bmiT {
    public static void main(String[] args){

        //variable
        double weight, height, bmi;
        String name;
        
        //input
        Scanner enter = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("00.00#");

        System.out.println("Welcome, what is your name?");
        name = enter.next();
        System.out.println("****");
        System.out.println("Hello " + name +"!" + " Let's start?");
        System.out.println("******");
        
        System.out.println(" so, tell me your weight, please! ");
        System.out.println("********");
        weight = enter.nextDouble();
        
        System.out.println("Perfect! Now tell me your height, please! " );
        System.out.println("********");
        height = enter.nextDouble();
        System.out.println("********");
        
        System.out.println("Thank you " + name + "!");
        System.out.println("********");
        
        
        //process
        bmi = weight / (height * height);
        
        //output
        System.out.println("ok, your body mass index is: " + formatador.format(bmi));
        System.out.println("********");

        enter.close();

        if(bmi < 18.5){
            System.out.println(".... bad wei...");
        }
        else if(bmi < 25){
            System.out.println("...Good waig...");
        }
        else if(bmi < 30){
            System.out.println("...um pouco acima");
        }
        else if(bmi < 35){
            System.out.println("grau 1");
        }
        else if(bmi < 40){
            System.out.println("grau 2");
        }
        else{
            System.out.println("Obeso toatal");
        }

    }

}



