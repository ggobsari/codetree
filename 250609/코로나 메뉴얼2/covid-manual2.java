import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        int[] arr = new int[4];

        for (int i = 0; i < 3; i++){
            String s = sc.next();
            double n = sc.nextDouble();

            if (s.equals("Y")){
                if (n >= 37){
                    arr[0] += 1;
                    cnt++;
                } else if (n == 36.5){
                    arr[2] += 1;
                }
            }

            if (s.equals("N")){
                if (n >= 37){
                    arr[1] += 1;
                } else if (n == 36.5){
                    arr[3] += 1;
                }
            }
        }        

        for (int result : arr){
            System.out.print(result + " ");
        }

        if (cnt >= 2){
            System.out.print("E");
        }
    }
}