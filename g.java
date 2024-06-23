import java.util.*;

public class g {
    public static void main(String[] args){
        int arr[]= {5,6,3,2,8,1};
        // bubble sort
        {
        for(int i=0; i< arr.length-1;i++){
            for(int j=0; j< arr.length-i-1; j++)
            {
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            }
        }
        }
        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }

    // selection sort 
  { for(int i=0; i<arr.length-1;i++){
        int smallest=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[smallest]>arr[j])
            {
                smallest=j;
            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]= temp;
    }
    for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }


    }
}
