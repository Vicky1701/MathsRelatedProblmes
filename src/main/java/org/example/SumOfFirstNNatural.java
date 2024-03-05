package org.example;

public class SumOfFirstNNatural  {

    public static void main(String[] args) {
        forloop(args);
    }

    public static void forloop(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //Method 2 : Using Formula for the Sum of Nth Term

    //Formula to Find the Sum of N terms
    //Sum = ( Num * ( Num + 1 ) ) / 2

    public static void formula(String[]args)
    {

        int n = 10;

        System.out.println ( n*(n+1)/2);
    }

    //Method 3 : Using Recursion

    public static void Recursion (String[]args)
    {

        int n = 10;
        int sum = getSum (n);

        System.out.println (sum);
    }

    static int getSum (int n)
    {
        if (n == 0)
            return n;

        return n + getSum (n - 1);
    }
}
