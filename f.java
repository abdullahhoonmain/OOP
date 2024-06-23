import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class f{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int size;
        System.out.println("Enter the number of elements in array");
        size=sc.nextInt();
        int[] array= new int [size];
        for(int i=0 ;i<size;i++)
        {
            System.out.print("Enter element no. "+ (i+1) + " " );
           array[i]=  sc.nextInt();
        }
        System.out.println("The entered array is:");
        for(int i=0; i<size; i++)
        {
            System.out.print(array[i]);
            System.out.println();
        }


        int [][] array2D= new int [2][3];
        System.out.println("Enter the elements ");
        for(int i=0; i<2; i++)
        {
             for(int j=0; j<3; j++)
             {
                array2D [i][j]= sc.nextInt();
             }
        }
        System.out.println("The entered array is");
    
    for(int i=0; i<2; i++)
    {
        for(int j=0; j<3; j++)
        {
            System.out.print(array2D[i][j]+" ");
        }
        System.out.println();
    }

    int rows; int cols;
    System.out.println("enter the row and column count: ");
    rows=sc.nextInt();
    cols=sc.nextInt();
    int [][] array2D2= new int[rows][cols];
    System.out.println("Enter the elements");
    for(int i=0; i<rows; i++)
    {
        for(int j=0;j<cols; j++)
        {
            array2D2[i][j]= sc.nextInt();
        }
    }

    int find;
    System.out.println("enter the element you want to find. ");
    find= sc.nextInt();

    for(int i=0; i<rows; i++)
    {
        for(int j=0; j<cols; j++)
        {
            if (array2D2[i][j]== find )
            {
                System.out.printf("element "+ find + "found at "+i+" "+ j);
            }
        }
    }

}
}