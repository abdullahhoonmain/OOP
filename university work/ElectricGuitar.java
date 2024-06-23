public class ElectricGuitar extends StringInstrument {

    
    public void voice() {
        System.out.println("Electric Guitar is rocking with "+noofstrings);
    }

    public ElectricGuitar(){
        noofstrings=5;
        color= "blue";
    }

    ElectricGuitar(int noofstrings){
        this.noofstrings= noofstrings;
    }
    
}
