package Exercise;

import java.util.LinkedList;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        LinkedList<Integer> myStack = new LinkedList<>();
        int[] myArr = {1, 3, 4, 2, 5, 9, 10, 24, 32, 18};

        System.out.println("Before reverse array:");
        for (int x : myArr){
            myStack.push(x);
            System.out.println(x + " ");
        }
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myStack.get(i);
        }
        System.out.println();

        System.out.println("After reverse array:");
        for (int x : myArr){
            myStack.push(x);
            System.out.println(x + " ");
        }
    }
}
