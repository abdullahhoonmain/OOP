import java.util.Scanner;

public class e{
// public static int sumNumber(int a, int b){
//     int sum= a+b;
//     return sum;
// }
// public static void printName(){
//     System.out.println("Enter your name");
//     Scanner input= new Scanner(System.in);
//     String name= input.nextLine();
//     System.out.println("This is your name "+name);
// }
// public static void facNumber(){   
//     Scanner input= new Scanner(System.in);
//     System.out.println("enter a number for factorial");
//     int inputno= input.nextInt();
//     int fac=1;
//     for(int i=inputno; i>=1; i--)
//     {
//         fac= fac*i;
//     }
//     System.out.print("the factorial is "+fac);
// }
public static void Fibonacci(){
    int num1=0;
    int num2=1;
    int sum=0;
    System.out.println(num1);
    System.out.println(num2);
    for(int i=1; i<=20; i++)
    {
        sum= num1+num2;
        System.out.println(sum+" ");
        num1= num2;
        num2= sum;
    }
    
    
}
    public static void main (String[] args){

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter number 1:");
    // int a= sc.nextInt();
    // System.out.println("Enter number 2:");
    // int b= sc.nextInt();
    // int sum= sumNumber(a,b);
    // System.out.println(sum);
    // printName();
    // facNumber();
    Fibonacci();


}
}


