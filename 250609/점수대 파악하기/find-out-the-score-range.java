import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        while(true){
            int n = sc.nextInt();

            if (n == 0){
                break;
            }

            if (n >= 10){
                int ten = n / 10;

                arr[ten - 1] += 1;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.printf("%d - %d\n", 10 * (i + 1), arr[i]);
        }
        
    }
}