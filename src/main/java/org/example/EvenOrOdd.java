package org.example;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 29;


        //checking whether the number is even or odd
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is odd");


        //Using Ternary Operator Syntax -

        // ( Condition ) ? ( if True : Action ) : ( if False : Action ) ;

        //Checking if the number is divisible by 2
        String status = number % 2 == 0 ? " is Even" : " is Odd";
        System.out.println(number + status);
    }
}
