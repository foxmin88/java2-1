package chapter2;

class Ep{
    public static int abs(int a) { return a>0?a:-a; }
    public static int max(int a, int b) { return (a>b)?a:b; }
    public static int min(int a, int b) { return (a>b)?b:a; }
}

public class Ep10 {
   public static void main(String[] args) {
    System.out.println(Ep.abs(-5));
    System.out.println(Ep.max(10, 8));
    System.out.println(Ep.min(-3, -8));
    }
}
