public class FactorialRecursive implements Factorial {
    public int factorial (int n) {
        if (n==0) {
            return 1; // Return 1 if n is 0.
        }
        return n*factorial(n-1); // Runs the function again with n subtracted by 1 as parameter.
    }
}
