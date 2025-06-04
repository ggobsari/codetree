import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int idx = 0;

        for (int i = 0; i < arr.length; i++){
            int n = sc.nextInt();

            arr[i] = n;

            if (n == 0){
                idx = i;
                break;
            }
        }

        int sum = arr[idx - 1] + arr[idx - 2] + arr[idx - 3];

        System.out.print(sum);
    }
}