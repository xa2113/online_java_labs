package input_output.labs;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

//class Exercise_01 {
//
//    public static void main(String[] args) throws IOException {
//
//        int i;
//        BufferedInputStream fin = null;
//        BufferedOutputStream fout = null;
//
//        try {
//            fin = new BufferedInputStream(args[0]);
//
//            fout = new BufferedOutputStream(args[0]);
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

