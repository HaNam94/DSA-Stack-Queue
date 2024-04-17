package Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String input = myScanner.nextLine();
        getFrequencyOfCharacters(input);
    }

    public static void getFrequencyOfCharacters(String input){
        Map<Character, Integer> myTreeMap = new TreeMap<>();
        input = input.toLowerCase();
        Character eachChar;
        int freq;
        for (int i = 0; i < input.length(); i++) {
            eachChar = input.charAt(i);
            if (eachChar != ' '){
                if (myTreeMap.containsKey(eachChar)){
                    freq = myTreeMap.get(eachChar);
                    freq++;
                } else {
                    freq = 1;
                }
                myTreeMap.put(eachChar,freq);
            }
        }
        int i = 1;
        System.out.println("Key-Characters-Frequency");
        for (Character key : myTreeMap.keySet()) {
            System.out.println("Key " + i + ": " + key + " - " + myTreeMap.get(key));
            i++;
        }
    }
}
