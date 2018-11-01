package conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

//public class Exercise_07 {
//    public static void main(String[] args) {
//
//        //scanner and initialize string
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a word: ");
//        String word = scanner.next();
//
//        for(int i = 0; i < word.length(); i++){
//            char c = word.charAt(i);
//            while (c == 63 ){
//                System.out.println(c);
//            }
//        }
//    }
public class Exercise_07 {
    public static void main(String[] args) {

        //scanner and initialize string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = scanner.next();

        //while loop
        int i = 0;
        while(i < word.length()){

            if ((word.charAt(i) == 'a')||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')){
                System.out.println("The vowel is " + word.charAt(i));

                break;

            }
            i++;
        }
        System.out.println("The word is " + word);
    }
}


