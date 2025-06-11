import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 0;

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();

            if (min > n){
                min = n;
            }
        }

        System.out.print(max);
    }
}