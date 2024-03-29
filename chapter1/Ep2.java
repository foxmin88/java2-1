package chapter1;

import java.util.Scanner;
//반복문 예제
public class Ep2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0, n=0;
        double sum=0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하시오");
        while((n = scanner.nextInt()) != 0) {
            sum = sum + n;
            count++;
        }
        System.out.println("수의 개수는" + count + "개이며");
        System.out.println("평균은 " + sum/count + "개입니다.");
        scanner.close();
    }
}
