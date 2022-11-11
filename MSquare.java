package assignment4_1;

import java.util.Scanner;

public class MSquare
{
    public static void accpetData(int matrix[][])
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < matrix.length; i++)
        {
            for(int k = 0; k < matrix[i].length; k++)
            {
                System.out.print("\n Please Enter the integer number for [" + i + "] [" + k + "]: ");
                matrix[i][k] = input.nextInt();
            }
        }
        for(int i = 0; i < matrix.length; i++)
        {
            for(int k = 0; k < matrix[i].length; k++)
            {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
        input.close();
    }
    public static boolean CekMagicMtrix(int matrix[][])
    {
        int left_Diagonal_Sum = 0, right_Diagonal_Sum = 0; 
        //to calculate the sum of the left diagonal
        for(int i = 0; i < matrix.length; i++)
            left_Diagonal_Sum = left_Diagonal_Sum + matrix[i][i];

        //to calculate the sum of right diagonal
        for(int i = 0; i < matrix.length; i++)
            right_Diagonal_Sum = right_Diagonal_Sum + matrix[i][matrix.length - 1 - i];
        if(left_Diagonal_Sum != right_Diagonal_Sum)
            return false;
        // to calculate each row sum
        for(int i = 0; i < matrix.length; i++)
        {
            int row_Sum = 0;
            for(int k = 0; k < matrix.length; k++)
                row_Sum += matrix[i][k];
            if (row_Sum != left_Diagonal_Sum)
                return false;
        }
        // Loops to calculate each column sum
        for(int i = 0; i < matrix.length; i++)
        {
            int column_Sum = 0;
            for(int k = 0; k < matrix.length; k++)
                column_Sum += matrix[k][i];
            if(column_Sum != left_Diagonal_Sum)
                return false;
        }
        return true;
    }
}
