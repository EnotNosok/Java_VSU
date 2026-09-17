import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус квадрата");
        int r= scanner.nextInt();
        if (r<0){
            System.out.println("нельзя <0 вводить ");
        }
        else {
            System.out.println("Введите сторону квадрата");
            int a = scanner.nextInt();
            if (a < 0) {
                System.out.println("wrong");
            }
            else {
                double S = 3.14 * (Math.pow(r, 2));
                double Skv = Math.pow(a, 2);
                if (S > Skv) {
                    int k = 0;
                    System.out.println("можно описать квадрат");
                    for (int i = 0; i < 4; i++) {
                        while (Skv * i < S) {
                            k += 1;
                            break;
                        }
                        System.out.println("Для описания квадрата понадобится " + k + " кругов");
                        break;

                    }
                } else {
                    System.out.println("Нельзя");
                }

            }
        }
    }
}