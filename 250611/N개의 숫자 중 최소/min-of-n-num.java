import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }

        int cnt = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == min){
                cnt++;
            }
        }

        System.out.print(min + " " + cnt);
    }
}