import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para descobrir seu fatorial: ");
        int num = sc.nextInt();
        int fat = 1;
        int c = num;
        while (c > 0) {
            fat *= c;
            c--;
        }
        System.out.print("O fatorial de " + num + " é: " + fat);
    }
}
