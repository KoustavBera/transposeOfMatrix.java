package lec21_2DArrays.java;

import java.util.Scanner;

public class transpose {
    public static void print2DArray(int[][]array,int row,int column){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeOfMatrix(int[][]array,int row,int column){
        int[][] ans=new int[column][row];
        //transversing the ans array
        for(int i=0;i<column;i++){
            for(int j=0;j<column;j++){
                ans[i][j]=array[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] array=new int[row][column];
        System.out.println("Enter "+row*column+" elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input ARRAY:");
        print2DArray(array,row,column);
        int[][] ans=transposeOfMatrix(array,row,column);
        System.out.println("Output ARRAY");
        print2DArray(ans,column,row);
    }
}
