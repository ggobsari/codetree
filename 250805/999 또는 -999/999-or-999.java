import java.util.Scanner;
import java.util.ArrayList;

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

        arr.sort(Comparator.naturalOrder());

        System.out.println(arr.get(0) + " " + arr.get(arr.size() - 1));
    }
}