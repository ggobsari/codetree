import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int classroom = 0;
        int corridor = 0;
        int toilet = 0;

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--){
            if (i % 12 == 0){
                toilet++;
            } else if (i % 3 == 0){
                corridor++;
            } else if (i % 2 == 0){
                classroom++;
            }
        }

        System.out.print(classroom + " " + corridor + " " + toilet);


    }
}