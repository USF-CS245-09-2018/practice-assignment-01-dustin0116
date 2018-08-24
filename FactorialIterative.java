public class FactorialIterative implements Factorial {

    public int factorial(int n) {
        int x = n; // Stores n to access it as previous
        for (int i = n-1; i > 0; i--) {
            x*=i; // Every time n multiplies by itself subtracted by 1.
        }
        return x;
    }
}
