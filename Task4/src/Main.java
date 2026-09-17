import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==0 || n<0){
            System.out.println("Вы ввели неправильное число");
        }
        double result = 0;
        for (int i=0; i<n+1; i++){
            result += Math.pow(i,n-i+1);
        }
        System.out.println("Результат суммы " + result);

    }
}