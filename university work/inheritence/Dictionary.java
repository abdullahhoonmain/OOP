package Inheritance;

public class Dictionary extends Book {
    private int definitions= 52500;
    public double computeratio(){
        return definitions;
    }
    public void setdefinitions(int numdefinition){
        definitions= numdefinition;
    }
    public int getdefinitions(){
        return definitions;
    }
}
