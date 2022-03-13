public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, result, adet = 9;
        System.out.println("Fibonacci dizisinin ilk " + adet + " sayısı.\n--------" + b);
        for (int i = 1; i < adet; i++) {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
            a = b;
            b = result;
        }
    }
}
