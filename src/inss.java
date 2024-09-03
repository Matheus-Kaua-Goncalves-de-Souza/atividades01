import java.util.Scanner;
public class inss {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu salário bruto: ");
        double salbruto = entrada.nextDouble();


        if (salbruto < 1412.01) {
            double desinss = (salbruto*0.075);
            double salliquid = (salbruto - desinss);
            System.out.printf("O valor descontado do seu salário é de: R$%.2f%n" , desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else if (salbruto > 1412 && salbruto < 2666.69) {
            double desinss = (salbruto*0.09)-21.18;
            double salliquid = (salbruto - desinss);
            System.out.printf("O valor descontado do seu salário é de: R$%.2f%n" , desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else if (salbruto >2666.98 && salbruto < 4000.04) {
            double desinss = (salbruto*0.12)-101.18;
            double salliquid = (salbruto - desinss);
            System.out.printf("O valor descontado do seu salário é de: R$%.2f%n" , desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else if (salbruto > 4000.03 && salbruto < 7786.03) {
            double desinss = (salbruto*0.14)-181.18;
            double salliquid = (salbruto - desinss);
            System.out.printf("O valor descontado do seu salário é de: R$%.2f%n" , desinss);
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
        else {
            double salliquid = salbruto - 908.86;
            System.out.println("O valor descontado do seu salário é de: 908,86");
            System.out.printf("Salario liquido: R$%.2f%n" , salliquid);
        }
    }
}

