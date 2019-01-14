import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Compare {

    public static int findMinimal(int a, int b){
        if (a < b){
            return a;
        }
        else
            return b;
    }

    public static int findMaximal(int a, int b){
        if (a > b){
            return a;
        }
        else
            return b;
    }



}
