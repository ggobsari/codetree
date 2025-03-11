import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        String[] arr = new String[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }

        String[] reverse = new String[10];

        for (int i = 0; i < 10; i++){
            reverse[i] = arr[(arr.length - 1) - i];
        }

        for (String a : reverse){
            System.out.print(a);
        }
    }
}