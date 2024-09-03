import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero1, numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite um número: ");
        numero2 = entrada.nextInt();
        System.out.println("Você digitou os números " + numero1 + " e " + numero2 + " confira os resultados com as 4 operações:");
        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        if (numero2 > 0) {
            System.out.println("Divisão: " + (numero1 / (double)numero2));
        } else System.out.println("Divisão inexistente");
    }
}
