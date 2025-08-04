import java.util.Scanner;
import java.text.DecimalFormat;

public class AloMundo1 {
    public static void main(String[] args){
        //variavel
        double peso, altura, imc ;

        //obvjedto
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.000");
        System.out.println("calculo do imc");

        // entrada
        System.out.println("Digite o seu peso: ");
        peso = teclado.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = teclado.nextDouble();

        //processamento
        imc = peso / (altura * altura);

        //saida
        System.out.println("IMC: " + formatador.format(imc));

        teclado.close();
    }
}
