import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();

            list.add(num);
        }

        Collections.sort(list);

        System.out.print(list.get(list.size() - 1) + " " + list.get(list.size() - 2));
    }
}