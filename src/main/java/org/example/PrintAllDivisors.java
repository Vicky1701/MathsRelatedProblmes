package org.example;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = 6 ;
        for ( int i = 1 ; i <= n ; i ++){
            if(n%2 == 0){
                System.out.print(i);
            }

        }
    }
}
