package Exercise;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;
import java.util.Stack;

public class BracketsChecking {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input an expression with brackets: ");
        String input = myScanner.nextLine();
        System.out.println("The brackets valid? " + isValidBracket(input));
    }
    public static boolean isValidBracket(String input){
        Stack bStack = new Stack();
        System.out.println("Check empty at beginning: " + bStack.isEmpty());
        Character sym;
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++) {
            sym = input.charAt(i);
            if (sym.equals('(')){
                bStack.push(sym);
            } else if (sym.equals(')')){
                if (bStack.isEmpty()){
                    isValid = false;
                    System.out.println("Check empty: " + bStack.isEmpty());
                    break;
                } else {
                    System.out.println("Pop:" + bStack.pop());
                }
            }
        }
        if (!bStack.isEmpty()){
            isValid = false;
        }
        return isValid;
    }
}
