package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 4776;
        int revs = 0;
        while(n>0){
            int rem = n%10;
            revs = (revs*10) + rem;
            n = n/10;
        }
        System.out.print("Reverse : " + revs);
    }
}
