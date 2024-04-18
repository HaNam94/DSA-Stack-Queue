package Exercise.change_decimal_to_binary_using_stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input a decimal number: ");
        int number = myScanner.nextInt();

        Stack<Integer> myStack =new Stack<>();
        int modulo;
        int factor = number;
        String str = "";

        if (number == 0) str += "00";
        else if (number == 1) str += 01;
        else {
            while (factor != 0){
                modulo = factor % 2;
                myStack.push(modulo);
                factor = factor / 2;
            }
            while (!myStack.isEmpty()){
                str += myStack.pop();
            }
        }
        System.out.println("Binary Number: " + str);
    }
}
