package com.hopemoran.mylibrary;

public class Series {

    public static long nSum(int n) {
        return (n * (n+1)) / 2;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i=1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            long fib;
            fib = fibonacci(n - 1) + fibonacci(n - 2);
            return fib;
        }
    }
}
