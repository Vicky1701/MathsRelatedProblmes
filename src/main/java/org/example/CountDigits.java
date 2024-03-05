package org.example;

public class CountDigits {
    public static void main(String[] args) {
        int n = 456667;
        int count = 0;
        while(n>0){
            int remainder = n%10;
            n = n/10;
            count ++;
        }
        System.out.print("Count : " + count);
    }
}
