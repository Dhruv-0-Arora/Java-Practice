package Homework;

import java.util.ArrayList;

// 15th of February

class Calculate {

    public static void calculate(int n, int num, int count) {
        count += 1;
        num += count;
        if (count < n) {
            calculate(n, num, count);
        } else {
            System.out.println(num);
        }
        
    }
    
    // Write a program in java to calculate the sum of numbers from 1 to n using recursion.
    public static void main(String[] args) {
        int n = 5;
        int num = 0;
        int count = 0;

        calculate(n, num, count);
    }

}


class Digits {

    public static void digits(int num, int digit) {
        num /= 10;
        digit += 1;

        if (num < 1) {
            System.out.println(digit);
        } else {
            digits(num, digit);
        }
    }

    // Write a program in java to find the total number of digits  using recursion. 
    public static void main(String[] args) {
        int num = 25;
        int digit = 0;
        digits(num, digit);
    }

}

class EvenOdd {

    public static void even(int num, int[] evenList, int count) {
        count += 1;
        if (count % 2 == 0) {
            evenList[count/2 - 1] = count;
        } if (count < num) {
            even(num, evenList, count);
        } else {
            System.out.println();
            System.out.print("The even numbers are: ");
            for (int i = 0; i < evenList.length; i++)
                System.out.print(evenList[i]);
        }
    }
    public static void odd(int num, int[] oddList, int count) {
        count += 1;
        if (count % 2 == 1) {
            oddList[(count-1)/2] = count;
        } if (count < num) {
            odd(num, oddList, count);
        } else {
            System.out.println();
            System.out.print("The odd numbers are: ");
            for (int i = 0; i < oddList.length; i++)
                System.out.print(oddList[i]);
            System.out.println();
        }
    }

    // Write a program in java to print even or odd numbers in given range using recursion. 
    public static void main(String[] args) {
        int num = 10;
        int count = 0;
        int[] evenList = new int[num/2];
        int[] oddList = new int[num/2];

        even(num, evenList, count);
        odd(num, oddList, count);

    }

}


class Power {

    public static void power(int baseNum, int powerVal, int count, int value) {
        count += 1;
        value *= baseNum;
        if (count < powerVal) {
            power(baseNum, powerVal, count, value);
        } else {
            System.out.printf("The value of %d to the power of %d is %d", baseNum, powerVal, value);
            System.out.println();
        }
    }

    // Write a program in java to calculate the power of any number using recursion.
    public static void main(String[] args) {
        int baseNum = 2;
        int powerVal = 6;
        int count = 0;
        int value = baseNum;

        power(baseNum, powerVal-1, count, value);
    }

}


class HailstoneSequence {

    public static void hailstoneSequence(ArrayList<Integer> sequence, int prevNum) {
        if (prevNum % 2 == 0) {
            sequence.add(prevNum/2);
            prevNum /= 2;
        } else if (prevNum %2 == 1) {
            sequence.add((prevNum*3)+1);
            prevNum = (prevNum*3)+1;
        } if (prevNum == 1) {
            System.out.printf("The HailStone starting at %d is: ", sequence.toArray()[0]);
            for (int i = 0; i < sequence.size(); i++) 
                System.out.print(sequence.toArray()[i] + ", ");
            System.out.println();
        } else {
            hailstoneSequence(sequence, prevNum);
        }
    }

    // Write a program in java to find the Hailstone Sequence of a given number upto 1.
    public static void main(String[] args) {
        ArrayList<Integer> sequence = new ArrayList<>();
        int prevNum = 13;
        sequence.add(prevNum);

        hailstoneSequence(sequence, prevNum);
    }

}