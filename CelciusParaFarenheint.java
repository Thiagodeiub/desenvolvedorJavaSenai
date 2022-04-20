import java.util.Scanner;

public class CelciusParaFarenheint {
        public static void main(String[] args) {
        System.out.println("Entre com a temperatura em celcius");
        Scanner scan = new Scanner(System.in);
        float celcius = scan.nextFloat();
        float farenheit;
            farenheit = (9 * celcius)/5 + 32;
        System.out.println("a temperatura correspondente em farenheit é: " + farenheit);

    }
}