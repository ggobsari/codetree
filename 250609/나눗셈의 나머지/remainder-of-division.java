import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int A = sc.nextInt();
        int B = sc.nextInt();

        while (true){
            int remain = A % B;
            arr[remain] += 1;

            A = A / B;

            if (A <= 1){
                break;
            }
        }

        int result = 0;

        for (int i = 0; i < arr.length; i++){
            result += arr[i] * arr[i];
        }

        System.out.print(result);
    }
}