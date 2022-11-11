package assignment4_1;

import static assignment4_1.MSquare.accpetData;
import static assignment4_1.MSquare.CekMagicMtrix;

public class MagicSquareTester {
    
    public static void main(String []s)
    {
        int matrix[][] = new int[4][4];
     
        accpetData(matrix);
        if(CekMagicMtrix(matrix))
            System.out.print("\n This is a Magic Matrix.");
        else
            System.out.print("\n This is not a Magic Matrix.");

    }
}
