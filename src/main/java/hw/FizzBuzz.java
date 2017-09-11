package hw;

import java.util.*;

public class FizzBuzz {


/**
 * This refactored method prints stores resulting Fizz Buzz data in a List.
 * @param  int  number chosen by a user that determines how many lines to print to the screen.
 * @return List<String> returns a List of the resulting data
 */

public static List<String> fizzBuzz(int n) {
    List<String> printList = new ArrayList<String>();
    if (n >= 0) {
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                printList.add("Fizz Buzz");
            } else if (i % 3 == 0) {
                printList.add("Fizz");
            } else if (i % 5 == 0) {
                printList.add("Buzz");
            } else {
                printList.add(String.valueOf(i));
            }
        }
        return printList;
    } else {
        return null;
    }
}

//    Part Three Solution
//    /**
//     * This refactored method prints stores resulting Fizz Buzz data in a String array.
//     * @param  int  number chosen by a user that determines how many lines to print to the screen.
//     * @return String[] returns an array of the resulting data
//     */
//
//    public static String[] fizzBuzz(int n) {
//        if (n >= 0) {
//            String[] printList = new String[n];
//
//            for(int i = 1; i <= n; i++) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    printList[i-1] = "Fizz Buzz";
//                } else if (i % 3 == 0) {
//                    printList[i-1] = "Fizz";
//                } else if (i % 5 == 0) {
//                    printList[i-1] = "Buzz";
//                } else {
//                    printList[i-1] = String.valueOf(i);
//                }
//            }
//            return printList;
//        } else {
//            System.out.println("Negative numbers are not accepted");
//            return null;
//        }
//    }


//    Part Two Solution
//    /**
//     * This method prints to the screen numbers starting from one up to the given input choice.
//     * It replaces numbers divisible by 3 with the word 'Fizz'.
//     * It replaces numbers divisible by 5 with the word 'Buzz'.
//     * It replaces numbers divisible by 3 and 5 with the word 'Fizz Buzz'
//     * @param  int  number chosen by a user that determines how many lines to print to the screen.
//     */

//    public static void printResult(int numChoice) {
//
//        for(int i = 1; i <= numChoice; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
}


/*
Pseudocode!
Input: A positive number as a command line argument
Output: Starting from 1, prints out number to screen based on the following conditions:
IF number is divisible by 3, print 'Fizz'
ELSE IF number is divisible by 5, print 'Buzz'
ELSE IF number is visible by 5 and 3, print 'Fizz Buzz'
ELSE print number
Break when number is equal to the input number.
*/