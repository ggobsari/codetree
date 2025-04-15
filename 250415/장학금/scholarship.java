import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >= 95){
            System.out.print(100000);
        } else if (a >= 90){
            System.out.print(50000);
        } else {
            System.out.print(0);
        }
    }
}