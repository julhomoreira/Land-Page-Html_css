import java.util.Scanner;

public class taxes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double grosPay, totalgross, tax;
        int taxRate = 40;
        int taxCredit = 50;
        String name;

        int groP1;

        System.out.println("hello!\nWhat your name? ");
        name = input.next();

        System.out.println("Olá," + name + " tudo bem?\n\nPor favor! Informe a opcao/chave desejada:\n>> 1 : Trabalho\n>> 2 : Viagem\n>> 3 : GrosPay ");
        System.out.println("---------------------***");
        groP1 = input.nextInt();
        System.out.println("----> " + groP1 + " selected!");
        System.out.println("---------------------***");

        if(groP1 == 1){
            System.out.println("Nomento estamos fora do AR. Tente novamente mais tarde!");
        }
        else if(groP1 == 2){
            System.out.println("Temos diversas opcoes aqui para suas feriashttps: //pt.wikipedia.org/wiki/Natal_(Rio_Grande_do_Norte)");
        }
        else if(groP1 == 3){
            System.out.println("Digite seu GrossPray, Por favor!");

            grosPay = input.nextDouble();
            System.out.println("--------------------------***--------------------------***----------------------------");


            tax = ((grosPay * taxRate) / 100) - taxCredit;
            System.out.println(" A sua tax ficou no total de: " + tax);
            System.out.println("-------------***----------------------");

            totalgross = (grosPay - tax);

            System.out.println("E seu valor bruto salarial ficou: " + totalgross);

        }
        else if(groP1 == 0 || groP1 > 3){
            System.out.println("Selecione uma opcao valida!");
        }
        else{
            System.out.println("Invalida, tente novamente!");
            
        }
        
        //System.out.println("Olá, tudo bem? Digite seu Gross pay: ");
        /*grosPay = input.nextDouble();
        System.out.println("--------------------------***--------------------------***----------------------------");


        tax = ((grosPay * taxRate) / 100) - taxCredit;
        System.out.println(" A sua tax ficou no total de: " + tax);
        System.out.println("-------------***----------------------");

        totalgross = (grosPay - tax);

        System.out.println("E seu valor bruto salarial ficou: " + totalgross);
        /* */

        input.close();



    }
}
