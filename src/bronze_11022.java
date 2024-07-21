//A+B - 8 - 11022
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class bronze_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 수를 입력받음
        int T = sc.nextInt();

        // 각 테스트 케이스를 처리
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            // 지정된 형식에 맞춰 결과물 출력
            System.out.println("Case #" + i + ": " + A + "+" + B + "=" + (A+B));
        }

        // 스케너를 닫음
        sc.close();
    }
}
