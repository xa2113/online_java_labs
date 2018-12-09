package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_02 {

    public static void main(String[] args) {

        String s;

        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/Eileen/Documents/CodingNomads/online_course/test2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("test_output.txt"));

            while((s=br.readLine()) !=null){
                System.out.println(s);
            }
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}
