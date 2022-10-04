package org.example.Recursion;

public class Modulo {

    private static int mod(int dividend, int divisor) {

        if (divisor == 0) {
            System.out.println("Divisor cannot be 0");
            return -1;
        }

        if(dividend < divisor){
            return dividend;
        }

        return mod(dividend - divisor,divisor);
    }


    public static void main( String args[] ) {
        int dividend = 27;
        int divisor = 5;
        int remainder = mod(dividend, divisor);
        System.out.println(dividend + " mod " + divisor + " = " + remainder);
    }




}
