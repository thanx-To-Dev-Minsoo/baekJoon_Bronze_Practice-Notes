//합 - 8393
//n이 주어졌을 때, 1부터 n까지 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class bronze_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println(sum);

        sc.close();
    }
}
