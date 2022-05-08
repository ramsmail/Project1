import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
public class MeanFromFile {

    public static void main(String args[]) throws FileNotFoundException {


        Scanner fileScan =  new Scanner(new File("D:\\Technical\\Programming\\Repos\\Upgrad\\FirstProgram\\src\\quiz_numbers.txt"));

        int total = 0, scannedNum=0;
        while (fileScan.hasNext()){
            int scanNum = fileScan.nextInt();
            total = total + scanNum;
            scannedNum++;
        }
        System.out.println("Total " + total + " total numbers " + scannedNum);
        System.out.println("Mean = " + total/scannedNum);
    }
}
