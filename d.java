import java.util.Scanner;
    
    class Main3{
        public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
    
            for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n"); System.out.print("\n"); System.out.print("\n");
    
        int n=4; int m=5;
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=m; j++)
            {
                if(i==1 || j==1 || i==n || j==m)
                {
                    System.out.print('*');
                }
                else {System.out.print(" ");}
            }
            System.out.print("\n");
        }
        System.out.print("\n");System.out.print("\n");System.out.print("\n");
    
    
        for (int i=1; i<=5; i++)
        {
          for(int j=1; j<=i; j++)
          {
              System.out.print("*");
          }
        System.out.println("\n");
        }
    
        System.out.print("\n");System.out.print("\n");System.out.print("\n");
    
            for (int i=5; i>=1; i--)
            {
                for (int j=1; j<=i; j++)
                {
                    System.out.print("*");
                }
               System.out.println("\n");
            }
        System.out.print("\n"); System.out.print("\n"); System.out.print("\n");
    int x=4; 
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=x-i; j++)
            {
                System.out.print(" ");
            
            }
            for(int k=1; k<=i;k++)
            {
                System.out.print("*");
            }
        System.out.print("\n");
        }

                System.out.print("\n"); System.out.print("\n"); System.out.print("\n");



        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.print("\n"); System.out.print("\n"); System.out.print("\n");

        int y=5;
            for(int i=1; i<=5; i++)
            {
                for(int j=1; j<=y-i+1; j++)
                {
                    System.out.print(j);
                }
                System.out.print("\n");
            }


                System.out.print("\n"); System.out.print("\n"); System.out.print("\n");

        int z=5;
        int number=1;
        for(int i=1; i<=z; i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }

                System.out.print("\n");System.out.print("\n");System.out.print("\n");

        int a=5;
        for(int i=2; i<=a;i++)
        {
            for(int j=1; j<=i; j++)
            {
                int sum= i+j;
                if(sum%2==0)
                {
                    System.out.print("1");
                }
                else if(sum%2 !=0)
                {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

                System.out.print("\n"); System.out.print("\n"); System.out.print("\n");


    int b=4;
    for(int i=1; i<=4; i++)
    {
        
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        
       int spacex= 2* (b-i);
       for(int k=1; k<=spacex; k++)
       {
         System.out.print(" ");

       }
         
          for(int l=1; l<=i; l++)
        {
            System.out.print("*");
        }
         System.out.println();
    }

        System.out.print("\n"); System.out.print("\n"); System.out.print("\n");

    for(int i=4; i>=1; i--)
    {
        
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        
       int spacex= 2* (n-i);
       for(int k=1; k<=spacex; k++)
       {
         System.out.print(" ");

       }
         
          for(int l=1; l<=i; l++)
        {
            System.out.print("*");
        }
         System.out.println();
    }

        System.out.print("\n"); System.out.print("\n"); System.out.print("\n");


    int q=5;
    for(int i=1; i<=q; i++)
    { 
        int spacev= (q-i);
        for(int k=1; k<=spacev; k++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=5; j++)
        {
        System.out.print("*");
        }
        System.out.println();

    }


}
}
    

