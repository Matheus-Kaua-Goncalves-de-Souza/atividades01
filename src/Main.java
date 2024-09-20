import java.util.Scanner;

public class Main {
    public static int QTD_ALUNOS = 10;
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = new int[QTD_ALUNOS];

        for (int i = 0; i < QTD_ALUNOS; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            num[i] = ler.nextInt();
        }
        if (ordenado(num)) {
            System.out.println("O vetor está em ordenado.");
        } else {
            System.out.println("O vetor não está em ordenado.");
        }
    }
    public static boolean ordenado (int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
