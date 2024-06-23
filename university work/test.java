public class test {
    public static void main(String[] args) {
        ElectricGuitar guitar1= new ElectricGuitar();
        guitar1.play();
        guitar1.voice();
        ElectricBassGuitar guitar2 = new ElectricBassGuitar();
        ElectricBassGuitar guitar3= new ElectricBassGuitar(6);
        guitar2.play();
        guitar2.voice();
        guitar3.voice();
    }
    
}
