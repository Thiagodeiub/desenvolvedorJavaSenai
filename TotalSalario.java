import java.util.Scanner;

public class TotalSalario {
    public static void main(String[] args) {
        System.out.println("Quanto você ganha por hora?");
        Scanner scan = new Scanner(System.in);
        float valorDaHora = scan.nextFloat();
        System.out.println("Qual foi o número de horas trabalhadas no mês?");
        int horasTrabalhadas = scan.nextInt();
        float totalSalario = valorDaHora*horasTrabalhadas;
        System.out.println("O total do seu salário no referido mês foi de: "+totalSalario);
    }
}
