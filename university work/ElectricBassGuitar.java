public class ElectricBassGuitar extends StringInstrument {

      ElectricBassGuitar(){
        noofstrings=8;
        color= "red";
    }

    ElectricBassGuitar(int noofstrings){
        this.noofstrings= noofstrings;
    }

    public void voice() {

        System.out.println("Electric Bass Guitar is rocking with "+noofstrings);
    }
    public void voice(int noofstrings) {

        System.out.println("Electric Bass Guitar is rocking with "+noofstrings);
    }
  

    
}
