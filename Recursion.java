package sk.kosickaakademia.mato.school;

public class Recursion {
    public static void main(String[] args) {
        int a = factorial(6);
        System.out.println(a);

    }

    private static int factorial(int b) {
        if (b == 1){
            return 1;
        }
        return b*factorial(b-1);

    }
}
