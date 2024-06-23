import java.util.Scanner;

class Main1{
    public static void main (String[] args){
    
        Scanner sc=  new Scanner(System.in);
        int age;
        System.out.println("Enter your age.");
        age= sc.nextInt();
        {if(age>=18)
        {
            System.out.println("Adult");
        }
        else{System.out.println("Not Adult");}}
        
        System.out.println("Enter a number");
        int a= sc.nextInt();
        if(a % 2== 0)
        {
            System.out.println("even");
        }
        else if ( a % 2!=0)
        System.out.println("odd");

        System.out.println("Enter a marvel hero name");
        String name;
        name = sc.next();
        switch (name) {
            case "tony" : System.out.println("tony");
            break;
            case "thor" : System.out.println("thor");
            break;
            case "captain" : System.out.println("American");
            break;
            case "groot" : System.out.println("i'm groot");
            break;
            default : System.out.println("invalid ");
            
        }

        
    }
}