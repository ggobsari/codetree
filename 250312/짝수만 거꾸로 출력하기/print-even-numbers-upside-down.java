import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            if (num % 2 == 0){
                list.add(num);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}