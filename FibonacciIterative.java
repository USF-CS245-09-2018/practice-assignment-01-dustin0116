public class FibonacciIterative implements Fibonacci {

    public int fibonacci(int n) {
        int prev = 0;
        int fibNum = 1;

        if (n <= 1) {
            return n; // Returns 1 or 0 since fib(0) = 0 and fib(1) = 1.
        }

        for (int i = 2; i <= n; i++) {
            int temp = prev + fibNum; // New fibonacci number is the previous added with current.
            prev = fibNum; // Set original current fibonacci number as previous.
            fibNum = temp; // Set new fibonacci number as current.
        }
        return fibNum;
    }
}
