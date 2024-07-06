//A+B - 1000
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오

import java.util.Scanner;

public class bronze_1000 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 두 정수 A와 B 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // A와 B를 더하여 결과 출력
        System.out.println(a + b);

        // Scanner 닫기
        sc.close();
    }
}
