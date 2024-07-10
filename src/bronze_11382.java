//꼬마 정민 - 11382
//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다.
//이제 A + B + C 를 계산할 차례이다.

import java.util.Scanner;

public class bronze_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 큰 정수를 다루기 위해 long 타입 사용
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        // 세 수의 합 계산
        long sum = A + B + C;

        // 결과 출력
        System.out.println(sum);

        sc.close();
    }
}
