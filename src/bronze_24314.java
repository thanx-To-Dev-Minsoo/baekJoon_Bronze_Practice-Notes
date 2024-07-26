//코딩은 체육과목 입니다 - 25314
//오늘을 혜아의 면접 날이다. 면접 준비를 열심히 해서 앞선 질문들을 잘 대답한 혜아는 이제 마지막으로 칠판에 직접 코딩하는 문제를 받았다.
//혜아가 받은 문제는 두 수를 더하는 문제였다. C++ 책을 열심히 읽었던 혜아는 간단히 두 수를 더하는 코드를 칠판에 적었다.
//코드를 본 면접관은 다음 질문을 했다. "만약, 입출력이 NN 바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?

//혜아는 책에 있는 정수 자료형과 관련된 내용을 기억해 냈다. 책에는 long int 는 44바이트 정수까지 저장할 수 있는 자료형이고
//long long int 는 88바이트까지 정수에 저장할 수 있는 정수자료형이라고 적혀있었다. 혜아는 이런 생각이 들었다.
//"int 앞에 long 을 하나씩 더 붙일 때마다 44바이트씩 저장할 수 있는 공간이 늘어나는 걸까?
//분명 long long long int 는 1212바이트, long long long long int 는 1616바이트까지 저장할 수 있는 정수 자료형일 거야!
//그렇게 혜아는 당황하는 면접관의 얼굴을 뒤로한 채 칠판에 정수 자료형을 써 내려가기 시작했다.

//혜아가 NN 바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은 무엇일까?

import java.util.Scanner;

public class bronze_24314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int numberOfLongs = N / 4;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberOfLongs; i++) {
            result.append("long ");
        }

        result.append("int");
        System.out.println(result.toString());
    }
}
