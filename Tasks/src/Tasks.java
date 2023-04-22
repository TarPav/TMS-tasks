import java.util.Scanner;
public class Tasks {
    public static void main(String args[]) {
        int Grad;
        int Min;
        int Sek;
        double Pi;
        Pi = 3.14159;
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте угол в градусах");
        Grad = in.nextInt();
        System.out.println("Впишите минуты");
        Min = in.nextInt();
        System.out.println("Впишите секунды");
        Sek = in.nextInt();
        double result;
        result = (Grad * Pi / 180) + (Min * Pi / 10800) + (Sek * Pi / 648000);
        System.out.println(result);
    }
}