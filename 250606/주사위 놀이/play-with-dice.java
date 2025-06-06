import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int result[] = new int[6];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            for (int j = 1; j <= result.length; j++){
                if (arr[i] == j){
                    result[j - 1] += 1;
                    continue;
                }
            }
        }

        for (int i = 1; i <= result.length; i++){
            System.out.println(i + "-" + result[i - 1]);
        }
        
    }
}