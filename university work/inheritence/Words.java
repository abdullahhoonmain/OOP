package Inheritance;

public class Words{
    public static void main(String args[]){
        Dictionary webster = new Dictionary();
        System.out.println("total pages:" + webster.getpages());
        System.out.println("total definitations:" + webster.getdefinitions());
        System.out.println("Definitons:" + webster.computeratio());
    }
}