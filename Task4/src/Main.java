import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (Check(n)){
            System.out.printf("OK");
        }
        else{
            System.out.printf("Not ok");
            return;

        }
        double result = 0;
        for (int i=0; i<n+1; i++){
            result += Math.pow(i,n-i+1);
        }
        System.out.println("Результат суммы " + result);

    }
    public static boolean Check(int n){
        if (n==0 || n<0) {
            return false;
        }
        else{
            return true;
        }
    }
}