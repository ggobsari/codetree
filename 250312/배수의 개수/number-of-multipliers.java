import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int three = 0;
        int five = 0;

        for (int i = 0; i < 10; i++){
            int a = sc.nextInt();
            if (a % 3 == 0 && a % 5 == 0){
                three++;
                five++;
            } else if (a % 3 == 0){
                three++;
            } else if (a % 5 == 0){
                five++;
            }
        }

        System.out.print(three + " " + five);
    }
}