import java.util.Scanner;
public class Tasks {
    public static void main(String args[]) {
        int x1;
        int y1;
        int x2;
        int y2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x1");
        x1 = in.nextInt();
        System.out.println("Введите значение y1");
        y1 = in.nextInt();
        System.out.println("Введите значение x2");
        x2 = in.nextInt();
        System.out.println("Введите значение y2");
        y2 = in.nextInt();
        double result;
        result = ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
        double result1 = Math.sqrt(result);
        System.out.println("Длина отрезка составляет " + result1);
    }
}