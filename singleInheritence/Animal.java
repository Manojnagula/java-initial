
/**
 * Animal
 */
public class Animal {

    String name;
    String type;

    public void habitat(){
    System.out.println("Lives in water");       
    }
}

 class Whale extends Animal{

    public static void main(String[] args) {
        Whale whale1 = new Whale();
        whale1.habitat();
    }
}