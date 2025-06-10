import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();

            if (q1 == 1){
                System.out.println(arr[q2 - 1]);
            } else if (q1 == 2){
                int idx = -1;

                for (int j = 0; j < arr.length; j++){
                    if (arr[j] == q2){
                        idx = j + 1;
                        System.out.println(idx);
                        break;
                    }
                }

                if (idx == -1){
                    System.out.println(0);
                }
            } else if (q1 == 3){
                int q3 = sc.nextInt();

                for (int j = q2 - 1; j < q3; j++){
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
}