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

        sc.close();
    }
}
