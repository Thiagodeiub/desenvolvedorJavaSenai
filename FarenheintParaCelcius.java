import java.util.Scanner;

public class FarenheintParaCelcius {
    public static void main(String[] args) {
        System.out.println("Entre com a temperatura em farenheint");
        Scanner scan = new Scanner(System.in);
        float farenheit = scan.nextFloat();
        float celcius;
        celcius = 5 * ((farenheit-32) / 9);
        System.out.println("a temperatura correspondente em celcius é: " + celcius);

    }
}
