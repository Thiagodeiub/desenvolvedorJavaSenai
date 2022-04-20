import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        System.out.println("entre com o comprimento do lado do quadrado");
        Scanner scan = new Scanner(System.in);
        float lado = scan.nextFloat();
        float area, dobrodaarea;
        area = lado*lado;
        dobrodaarea = area*2;
        System.out.println("a área correspondente é: " +area+"! E "+dobrodaarea+" é o dobro da área");

    }
}
