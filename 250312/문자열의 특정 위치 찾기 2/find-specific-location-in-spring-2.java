import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int sum = 0;

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        for (int i = 0; i < 5; i++){
            if (arr[i].substring(2, 3).equal(a) || arr[i].substring(3,4).equal(a)){
                System.out.println(arr[i]);
                sum++;
            }
        }

        System.out.println(sum);
    }
}