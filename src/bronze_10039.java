//평균 점수 - 10039
//상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.
//어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다.
//40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다.
//보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.

import java.util.Scanner;

public class bronze_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int[] score = new int[] {a, b, c, d, e};
        int[] fs = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            int s = score[i];
            if (s >= 40) {
                fs[i] = s;
            } else {
                fs[i] = 40;
            }
        }

        int sum = 0;
        int average = 0;

        for (int i = 0; i < fs.length; i++) {
            sum += fs[i];
        }
        average = sum / fs.length;

        System.out.println(average);

        sc.close();
    }
}


//import java.util.Scanner;
//
//public class bronze_10039 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//
//        for (int i = 0; i < 5; i++) {
//            int score = sc.nextInt();
//            sum += Math.max(score, 40);
//        }
//
//        int average = sum / 5;
//        System.out.println(average);
//
//        sc.close();
//    }
//} 이 문제도 성공

