import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o numero da tabuada: ");
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "x" + i + "= " + (num * i));

        }


    }
}
