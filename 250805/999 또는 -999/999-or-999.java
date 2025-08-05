import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true){
            int num = sc.nextInt();

            if (num == 999 || num == -999){
                break;
            }

            arr.add(num);
        }

        Collections.sort(arr);

        System.out.println(arr.get(arr.size() - 1) + " " + arr.get(0));
    }
}