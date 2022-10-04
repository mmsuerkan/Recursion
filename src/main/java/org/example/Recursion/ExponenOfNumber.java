package org.example.Recursion;

public class ExponenOfNumber {

    private static long power(int num, int pow) {

        if(pow == 0){
            return 1;
        }
        return num * power(num,pow - 1);
    }


    public static void main( String args[] ) {

        int num = 4;
        int pow = 3;
        long result = power(num, pow);
        System.out.println(num + " power of " + pow + " is: " + result);
    }




}
