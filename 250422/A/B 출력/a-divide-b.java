import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a / b;

        System.out.print(result + ".");

        a %= b;

        for (int i = 0; i < 20; i++){
            a *= 10;
            System.out.print(a / b);
            a %= b;
        }
    }
}