import java.util.*; // a package.
class Employees{
    // ACCESS MODIFIERS
    //public can be accessed by anyone in the class or outside the class. can be accessed in some other package.
    public String name;

    // only the members of class can access.
    private String password;

    // can be accessed by sub-classes in other package and anyone in the same class.
    protected String email;

    // when a method or trait has no access modifier, it is default. the package in which it is made can access it only.
     String dob;

     // to get values of protected modifiers.
     public String getPassword(){
        return this.password;
     }

     // to set values of protected modifiers.
     public void setPassword(String pass){
        this.password= pass;
     }
}
class Automobilies{
        String company;
    String name;
    int model;
    String color;
        public void drive(){
        System.out.println("Driving");
    }
}
class Car extends Automobilies{


    public void sensors(){
        System.out.println("parking sensors");
    }
    public void carInfo(){
        System.out.println(this.company);
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.color);
    }
   // parameterized constructor 
    Car(String company, String name, int model, String color){
        this.company= company;
        this.name= name;
        this.model= model;
        this.color=color;

    }
 // non-parameterized constructor
    Car(){

    }

// copy constuctor 
    Car (Car car3){
        this.company= car3.company;
        this.name=  car3.name;
        this.model=  car3.model;
        this.color=  car3.color;
    }

// polymorphism 
    public void carInfo(String name, int model){
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.company);
    }

    public void carInfo(String company){
        System.out.println(this.company);
    }

}
// inheritance
class Bike extends Automobilies{
    Bike(String company, String name, int model, String color){
        this.company= company;
        this.name= name;
        this.model= model;
        this.color= color;
    }
    Bike(){

    }
}
public class i {
public static void main(String args[]){
  // if constructor is non-parameterized.
    Car car1= new Car();
    car1.company= "honda";
    car1.name= "civic";
    car1.color= "black";
    car1.model= 2007;

 // parameterized constuctor  
    Car car2= new Car("honda", "accord", 2006, "black");
    car2.carInfo();
// copy constructor 
    Car car3= new Car(car2);

    //car1.carInfo(car1.name, car1.model);

    Bike bike1= new Bike();
    bike1.company= "Suzuki";
    bike1.name="115";
    bike1.color="white";
    bike1.model= 2005;

    Bike bike2= new Bike("honda", "125", 2017, "red");

    Employees employee1= new Employees();
    employee1.name= "ahmed";
    employee1.email= "abc@gmail.com";
    employee1.dob="12-5-2232";
    employee1.setPassword("abc123");



    }
}
