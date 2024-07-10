//곱셈 - 2588
//사이트 문제 참고
//(세 자리 수) x (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class bronze_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String number = Integer.toString(b);

        int hundreds = Character.getNumericValue(number.charAt(0));
        int ten = Character.getNumericValue(number.charAt(1));
        int units = Character.getNumericValue(number.charAt(2));

        System.out.println(a * units);
        System.out.println(a * ten);
        System.out.println(a * hundreds);
        System.out.println(a * b);

        sc.close(); // 자원 해제 - 'Scanner' 객체를 닫아 자원을 해제합니다.
    }
}


// 클래스 및 메서드 선언
// import java.util.Scanner;
// public class Main {
// - 'import java.util.Scanner;': 표준 입력을 받기 위해 'Scanner' 클래스를 가져옵니다.
// - 'public class Main {': 'Main' 이라는 이름의 공용 클래스를 선언합니다.

// 'main' 메서드
// public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
// - 'public static void main(String[] args) {': 프로그램의 시작 지점 입니다.
// - 'Scanner sc = new Scanner(System.in);': 'Scanner' 객체를 생성하여 표준입력을 받습니다.

// 입력받기
// int a = sc.nextInt();
// int b = sc.nextInt();
// - 'int a = sc.nextInt();': 첫번째 정수 'a'를 입력받습니다.
// - 'int b = sc.nextInt();': 첫번째 정수 'b'를 입력받습니다.

// 정수 b의 자릿수 분리
// String number = Integer.toString(b);
// - 'String number = Integer.toString(b);': 정수 'b' 를 문자열로 변환하여 'number' 변수에 저장합니다.

// 자릿수 추출
// int hundreds = Character.getNumericValue(number.charAt(0));
// int ten = Character.getNumericValue(number.charAt(1));
// int units = Character.getNumericValue(number.charAt(2));
// - 'int hundreds = Character.getNumericValue(number.charAt(0));': 문자열 'number' 의 첫 번째 문자(백의 자리)를 정수로 변환하여 'hundreds' 변수에 저장합니다.
// - 'int ten = Character.getNumericValue(number.charAt(1));': 문자열 'number' 의 두 번째 문자(십의 자리)를 정수로 변환하여 'ten' 변수에 저장합니다.
// - 'int units = Character.getNumericValue(number.charAt(2));': 문자열 'number' 의 세 번째 문자(일의 자리)를 정수로 변환하여 'units' 변수에 저장합니다.
