import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){                
                int num = sc.nextInt();
                if (j >= i){
                    total += num;
                }
            }
        }
        
        System.out.println(total);
    }
}