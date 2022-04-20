import java.util.Scanner;

public class ExibirNumero {
    public static void main(String[] args) {
        System.out.println("digite um numero");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.println("o numero digitado foi: "+ numero);
    }
}
