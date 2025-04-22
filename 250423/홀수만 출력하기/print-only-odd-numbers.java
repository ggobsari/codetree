import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int n2 = sc.nextInt();

            if (n2 % 2 == 1 && n2 % 3 == 0){
                System.out.println(n2);
            }
        }


    }
}