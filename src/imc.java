import java.util.Scanner;
public class imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu peso(kg): ");
        double peso = entrada.nextDouble();
        System.out.print("Informe sua altura(m): ");
        double altura = entrada.nextDouble();

        double imc = peso/(altura*altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc > 18.4 && imc < 25) {
            System.out.println("Você está num peso ideal");
        } else if (imc > 24 && imc < 30) {
            System.out.println("Você está acima do preso");
        } else if (imc > 29.9) {
            System.out.println("Você está obeso");
        }
    }
}
