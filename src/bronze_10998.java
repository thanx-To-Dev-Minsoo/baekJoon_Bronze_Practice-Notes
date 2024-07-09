//AxB - 10998
//두 정수 A와 B를 입력받은 다음, AxB를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class bronze_10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A * B);

        sc.close();
    }
}
