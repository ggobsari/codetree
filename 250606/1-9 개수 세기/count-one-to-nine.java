import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[9]

        for (int i = 0; i < n; i++){
            int element = sc.nextInt();

            for (int j = 1; j <= 9; j++){
                if (j == element){
                    arr[j - 1] += 1;
                }
            }
        }

        for (int result : arr){
            System.out.println(result);
        }
    }
}