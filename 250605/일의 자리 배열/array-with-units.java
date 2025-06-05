import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 0; i < 8; i++){
            int num = n1 + n2;
            
            n1 = n2;
            n2 = num;

            System.out.print(num % 10 + " ");
        }
    }
}