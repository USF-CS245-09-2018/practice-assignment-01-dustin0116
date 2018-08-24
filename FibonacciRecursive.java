public class FibonacciRecursive implements Fibonacci {
    public int fibonacci (int n) {
        if (n<=1) {
            return n; // Returns 1 or 0 since fib(0) = 0 and fib(1) = 1.
        }

        return fibonacci(n-1) + fibonacci(n-2); // Returns function with new parameters since fib(n) = fib(n-1) + fib(n-2).
    }
}
