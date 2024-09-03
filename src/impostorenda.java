import java.util.Scanner;
public class impostorenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu salário bruto: ");
        double salbruto = scanner.nextDouble();

        double desinss=0;
        if (salbruto < 1412.01) {
            desinss = (salbruto*0.075);
            double salliquid = (salbruto - desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else if (salbruto > 1412 && salbruto < 2666.69) {
            desinss = (salbruto*0.09)-21.18;
            double salliquid = (salbruto - desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else if (salbruto >2666.98 && salbruto < 4000.04) {
            desinss = (salbruto*0.12)-101.18;
            double salliquid = (salbruto - desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else if (salbruto > 4000.03 && salbruto < 7786.03) {
            desinss = (salbruto*0.14)-181.18;
            double salliquid = (salbruto - desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else {
            double salliquid = salbruto - 908.86;
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        double desir = salbruto - desinss;

        double irrf = 0.0;
        if (desir <= 2112.00) {
            irrf = 0.0;
        }
        else if (desir <= 2826.65) {
            irrf = (desir * 0.075) - 158.40;
        }
        else if (desir <= 3751.05) {
            irrf = (desir * 0.15) - 370.40;
        }
        else if (desir <= 4664.68) {
            irrf = (desir * 0.225) - 651.73;
        }
        else {
            irrf = (desir * 0.275) - 884.96;
        }
        System.out.printf("O valor do imposto de renda: R$ %.2f%n", irrf);

    }
}
