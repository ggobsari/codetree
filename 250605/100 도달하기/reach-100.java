import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int i1 = 1;
        int i2 = n;

        while (true){
            int nextIndex = i1 + i2;

            System.out.print(nextIndex + " ");

            if (nextIndex >= 100){
                break;
            }

            i1 = i2;
            i2 = nextIndex;
        }

    }
}