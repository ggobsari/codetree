import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            String str = String.valueOf(i);
            if (i % 3 == 0){
                System.out.print(0 + " ");
            } else if (str.contains("3") || str.contains("6") || str.contains("9")){
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}