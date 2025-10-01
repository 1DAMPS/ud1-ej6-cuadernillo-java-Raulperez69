import java.util.Scanner;
public class ej04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un número entero");
        int num1 = sc.nextInt();
        System.out.println("introduce un número entero");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println ("la suma del numero es " + (num1 + num2)+"");
    }
}