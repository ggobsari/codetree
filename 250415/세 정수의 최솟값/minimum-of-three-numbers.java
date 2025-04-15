import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int low = 0;

        if (a <= b && a <= c){
            low = a;
        } else if (b <= a && b <= c){
            low = b;
        } else {
            low = c;
        }
        System.out.print(low);
    }
}