package org.example.Recursion;

public class SumOfIntegers {
    private static int sum(int sum) {

        if(sum == 0){
            return sum;
        }

        return sum + sum(sum -1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }


}
