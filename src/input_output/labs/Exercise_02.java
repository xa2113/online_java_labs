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

//class Exercise_02 {
//
//    public static void main(String[] args) throws IOException {
//
//        int i;
//        BufferedReader fin = null;
//        BufferedWriter fout = null;
//
//        try {
//            fin = new BufferedReader(args[0]);
//
//            fout = new BufferedWriter(args[0]);
//
//            //change e to #.
//            if (i == 65) fout.write(23);
//
//            do {
//                i = fin.read();
//                if (i != -1) fout.write(i);
//            } while (i != -1);
//        } catch(IOException exc) {
//            System.out.println("I/0 Error: " + exc);
//        } finally {
//
//            try{
//                if(fin != null) fin.close();
//            } catch(IOException exc) {
//                System.out.println("Error Closing Input File");
//            }
//            try{
//                if(fout != null) fout.close();
//            } catch(IOException exc) {
//                System.out.println("Error Closing Output File");
//            }
//        }
//    }
//}




//class Exercise_02 {
//
//    public static void main(String[] args) {
//
//        String s;
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("/Users/Eileen/Documents/CodingNomads/online_course/test2.txt"));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("test_output.txt"));
//
//            while((s=br.readLine()) !=null){
//                System.out.println(s);
//            }
//        } catch(IOException exc){
//            System.out.println("I/O Error: " + exc);
//        }
//    }
//}


