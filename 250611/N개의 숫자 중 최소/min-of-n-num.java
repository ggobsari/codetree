import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = sc.nextInt();

        for (int i = 1; i < n; i++){
            int num = sc.nextInt();

            if (min > n){
                min = n;
            }
        }

        System.out.print(min);
    }
}