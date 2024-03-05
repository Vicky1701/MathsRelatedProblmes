package org.example;

public class CheckPalidrome {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int revs = 0;
        while(n>0){
            int rem = n%10;
            revs = (revs*10) + rem;
            n = n/10;
        }
        if (revs == original){ // Compare with the original number
            System.out.println("Yes, it's a palindrome");
        } else {
            System.out.println("No, it's not a palindrome");
        }

    }
}
