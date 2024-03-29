package chapter1;
//while문 예제
public class Ep3 {
    public static void main(String[] args) {
        char foo = 'a';
        char bar = 'A';

        do {
            System.out.println(foo);
            foo = (char) (foo +1);
        }while (foo <= 'z');

        while (bar <= 'z') {
            System.out.println(bar);
            bar = (char) (bar +1);
        }
    }
}
