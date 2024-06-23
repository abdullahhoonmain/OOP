import java.util.*;

public class h{
public static void sumNumbers(int i, int n, int sum){
    if(i==n){
        sum = sum+i;
        System.out.print(sum);
        return;
    }
  
    sum=sum+i;
    sumNumbers(i+1, n, sum);
}
public static void factorialRecursion(int i, int n, int fac){
    if(i==n){
        fac= fac*i;
        System.out.println(fac);
        return;
    }
    fac= fac*i;
    factorialRecursion(i+1, n, fac);
}
public static void fibonacciRecursion(int a, int b, int fib){
    if(fib==1597){
        return;
    }
    fib= a+b;
    System.out.println(fib);
    fibonacciRecursion(b,fib,fib);
}

public static int stackHeight(int n, int x){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }
    int a= stackHeight(n-1, x);
    int b= x*a;
    return b;
}

public static int stackHeightLogN(int n, int x){
    if(x==0){
        return 0;
    }
    if(n==0){
        return 1;
    }

    
    if(n%2==0)
    {
    return stackHeightLogN(n/2, x)* stackHeightLogN(n/2, x);
    }
    
    else
    {
       return stackHeightLogN(n/2, x)* stackHeightLogN(n/2, x) * x;
    }
    
    
    
}


public static void main(String[] args){
   
    //sumNumbers(1,5,0);
    //factorialRecursion(1,5,1);
    //fibonacciRecursion(0,1,0);
   // int c=stackHeight(5, 2);
   // System.out.println(c);
    int d=stackHeightLogN(6, 2);
    System.out.println(d);
}
}