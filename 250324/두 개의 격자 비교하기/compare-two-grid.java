import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int num1 = sc.nextInt();
                arr1[i][j] = num1;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int num2 = sc.nextInt();
                arr2[i][j] = num2;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr1[i][j] == arr2[i][j]){
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}