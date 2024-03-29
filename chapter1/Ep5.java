package chapter1;

import java.util.Scanner;
//break문 예제
public class Ep5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit를 입력하면 종료됩니다.");
        while(true) {
            System.out.println(">>");
            String text = scanner.nextLine();
            if(text.equals("exit"))
                break;
        }
        System.out.println("종료합니다...");

        scanner.close();
    }
}
