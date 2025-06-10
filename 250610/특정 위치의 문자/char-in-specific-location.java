import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] c = {'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1;

        String s = sc.next();

        for (int i = 0; i < c.length; i++){
            if (s.eqauls(c[i])){
                idx = i;
                break;
            }
        }

        // if (idx != -1){
        //     System.out.print(idx);
        // } else {
        //     System.out.print("None");
        // }
    }
}