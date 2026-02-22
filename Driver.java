package mystuff;

public class Driver {
    public static void main(String[] args) {
        mystuff.MyStuff myLaptop = new mystuff.MyStuff();
        myLaptop.brand = "Apple";
        myLaptop.ramSize = 16;
        myLaptop.showSpecs();
    }
}