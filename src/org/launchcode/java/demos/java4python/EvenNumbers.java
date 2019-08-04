package org.launchcode.java.demos.java4python;
import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,54,2,35,45,65,78,56,15));
        int sum = sumOfEvens(numbers);
        System.out.println("The sum of all even numbers is " + sum);
    }

    public static int sumOfEvens(ArrayList<Integer> list){
        int sum = 0;
        for (Integer num : list){
            if (num % 2 ==0){
                sum += num;
            }

        }
        return sum;
    }
}
