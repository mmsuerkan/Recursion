package org.example.Recursion;

public class FibonacciSequence {
    private static int fibonacci(int number) {

        if(number == 1 || number == 0){
            return 1;
        }


        return fibonacci(number -1 ) + fibonacci(number -2);
    }

    public static void main(String[] args) {
        int input = 10;
        System.out.println("Fibonacci sequence for the first " + input + " elements is:");

        // Loop to print all the fibonacci sequence elements
        int i = 0;
        while (i < input) {
            System.out.print(fibonacci(i) + " ");
            i++;
        }
    }
    }
