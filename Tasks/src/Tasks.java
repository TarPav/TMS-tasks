import java.util.Scanner;
public class Tasks {
    public static void main(String args[]) {
        int h1;
        int m1;
        int h2;
        int m2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите час отправления");
        h1 = in.nextInt();
        System.out.println("Введите минуты отправления");
        m1 = in.nextInt();
        System.out.println("Введите час прибытия");
        h2 = in.nextInt();
        System.out.println("Введите минуты прибытия");
        m2 = in.nextInt();
        double result;
        double result1;
        result = ((h2 * 60 + m2) - (h1 * 60 + m1));
        result1 = (((h2+24) * 60 + m2) - (h1 * 60 + m1));
        if(h2>h1) {
            System.out.println("Время в пути составит = " + result);
        }
        else{
            System.out.println("Время в пути со сменой даты составит = " + result1);
        }
    }
}