package org.example;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 371;
        int original = n;
        int sum = 0;
        while(n> 0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }

        if (sum == original){
            System.out.println("Yes, it's a ArmstrongNumber");
        } else {
            System.out.println("No, it's not a ArmstrongNumber");
        }
    }
}
