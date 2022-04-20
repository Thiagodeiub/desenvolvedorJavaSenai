import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Digite o segundo número");
        int b = scan.nextInt();
        int c = a+b;
        System.out.println("A soma dos dois números é: "+c);

    }
}
