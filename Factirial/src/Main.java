import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Введите число в следующейс строчке, чтобы расчитать факториал");
        int n = a.nextInt();
        long resutl = 1;
        for (int i=1; i<n+1;i++ ){
            resutl*=i;
        }
        System.out.println("Factorial " + n + " = "+resutl);
    }
}