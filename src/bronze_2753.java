//윤년 - 2753
//연도가 주어졌을 때, 윤년이면 1, 아나면 0을 출력하는 프로그램을 작성하시오.
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

import java.util.Scanner;

public class bronze_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ((a % 4 == 0) && (a % 100 != 0)) {
            System.out.println("1");
        } else if ((a % 4 == 0) && (a % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        sc.close();
    }
}
