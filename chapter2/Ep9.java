package chapter2;

public class Ep9 {
    String title;
    String author;
    public Ep9(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Ep9 littlePrince = new Ep9{"어린왕자", "생텍쥐베리"};

        Ep9 loveStory = new Ep9("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
