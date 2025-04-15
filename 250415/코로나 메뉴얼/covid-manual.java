import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String aStat = sc.next();
        int a = sc.nextInt();
        String bStat = sc.next();
        int b = sc.nextInt();
        String cStat = sc.next();
        int c = sc.nextInt();

        String result = "";
        int cnt = 0;

        if (aStat.equals("Y") && a >= 37){
            cnt++;
        } 
        if (bStat.equals("Y") && b >= 37){
            cnt++;
        }
        if (cStat.equals("Y") && c >= 37){
            cnt++;
        }

        System.out.print(cnt >= 2 ? "E" : "N");
    }
}