package learn.java;

public class Sorter {
    public static void main(String[] args) {
        System.out.println(sort(10, 10, 10, 1)); // STANDARD
        System.out.println(sort(100, 100, 100, 1)); // SPECIAL
        System.out.println(sort(10, 10, 10, 20)); // SPECIAL
        System.out.println(sort(150, 10, 10, 20)); // REJECTED
        System.out.println(sort(100, 100, 100, 20)); // REJECTED
    }
    
    public static String sort(int width, int height, int length, int mass) {
        long volume = 1L * width * height * length;

        boolean bulky = volume >= 1_000_000L || width >= 150 || height >= 150 || length >= 150;
        boolean heavy = mass >= 20;

        if (bulky && heavy) return "REJECTED";
        if (bulky || heavy) return "SPECIAL";
        return "STANDARD";
    }
}
