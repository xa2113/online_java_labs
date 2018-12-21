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

    public static void main(String[] args) throws IOException {

        int i;
        BufferedReader fin = null;
        BufferedWriter fout = null;

        try {
            fin = new BufferedReader(new FileReader("/Users/Eileen/Documents/CodingNomads/online_course/test2.txt"));

            fout = new BufferedWriter(new FileWriter("test_output.txt"));

            //change e to #.

            do {
                i = fin.read();
                if (i == 101) i = 35;
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch(IOException exc) {
            System.out.println("I/0 Error: " + exc);
        } finally {

            try{
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try{
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}




