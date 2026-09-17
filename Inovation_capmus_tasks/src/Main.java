import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите нутульральное число");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        if (n%10==0 || n<0){
            System.out.println("Нельзя последний бит =0 или n<0");
        }
        else{
        int a=n/100;
        int c=n%10;
        int b=(n/10)%10;
        int result=c*100+b*10+a;
        System.out.println(result);}
    }
}