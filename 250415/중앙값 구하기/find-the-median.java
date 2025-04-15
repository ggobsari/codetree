import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;

        if (a >= b && a <= c && b <= c){
            result = a;
        } else if (b >= a && b <= c && a <= c){
            result = b;
        } else if (c >= a && c <= b && a <= b){
            result = c;
        }

        System.out.print(result);
    }
}