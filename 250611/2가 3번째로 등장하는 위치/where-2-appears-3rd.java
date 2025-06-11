import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int idx = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 2){
                idx++;
                if (idx == 3){
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}