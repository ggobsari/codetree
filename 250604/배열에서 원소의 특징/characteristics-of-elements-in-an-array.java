import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++){
            int n = sc.nextInt();

            arr[i] = n;

            if (n % 3 == 0){
                System.out.print(arr[i - 1]);
                break;
            }
        }
    }
}