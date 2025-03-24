import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            int total = 0;
            for (int j = 0; j < 4; j++){                
                int num = sc.nextInt();
                total += num;
                System.out.print(total);
            }
            System.out.println();
        }
    }
}