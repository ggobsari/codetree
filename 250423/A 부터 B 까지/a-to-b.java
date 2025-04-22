import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " ");

        while (a <= b){
            if (a % 2 == 1){
                a *= 2;
                System.out.print(a + " ");
            } else {
                a += 3;
                System.out.print(a + " ");
            }
        }
    }
}