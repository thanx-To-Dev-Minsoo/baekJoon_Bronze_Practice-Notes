//A+B - 5 - 10952
//주 정수 A와 B를 입력 받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class bronze_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(A + B);
        }

        sc.close();
    }
}


// 클래스 및 main 메서드 선언
// import java.util.Scanner;
// public class Main {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
// - 'import java.util.Scanner;': 표준 입력을 받기 위해 'Scanner' 클래스를 가져옵니다.
// - 'public class Main': Main 이라는 이름의 공용 클래스를 선언합니다.
// - 'public static void main(String[] args)': 프로그램릐 시작 지점입니다. 모든 자바 애플리케이션의 진입점입니다.
// - 'Scanner sc = new Scanner(System.in);': 'Scanner' 객체를 생성하여 표준 입력(키보드 입력)을 받을 준비를 합니다.

// 반복문 및 입력 처리
// while (true) {
//      int A = sc.nextInt();
//      int B = sc.nextInt();
// - 'while (true)': 무한 루프를 시작합니다. 이 루프는 'break' 문을 만나기 전까지 계속 반복됩니다.
// - 'int A = sc.nextInt();': 'Scanner' 객체를 사용하여 첫 번째 정수 'A' 를 입력받습니다.
// - 'int B = sc.nextInt();': 'Scanner' 객체를 사용하여 첫 번째 정수 'B' 를 입력받습니다.

// 종료 조건 및 출력
// if (A == 0 && B == 0) {
//      break;
// }
// System.out.println(A + B);
// }
// - 'if (A == 0 && B == 0)': 'A' 와 'B' 가 모두 0인 경우를 확인합니다.
// - 'break;': 조건이 참일 경우, 'break' 문을 실행하여 'while' 루프를 종료합니다.
// - 'System.out.println(A + B);': 'A'와 'B'의 합을 출력합니다.

// 자원 해제

// 전체적인 흐름
// - 'Scanner' 객체 생성: 'Scanner' 객체를 생성하여 표준 입력을 받습니다.
// - 무한 루프 시작: 'while (true)' 로 무한 루프를 시작합니다.
// - 정수 입력: 두 개의 정수 'A'와 'B'를 입력받습니다.
// - 종료 조건 확인: 두 정수가 모두 0인 경우 루프를 종료합니다.
// - 합 출력: 그렇지 않을 겨우 'A'와 'B'의 합을 출력합니다.
// - 자원 해제: 'Scanner' 객체를 닫습니다.