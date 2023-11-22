public class solarSystem {
    public solarSystem() {
        System.out.println("solar systems constructor");

    }

    public void contains() {
        System.out.println("contains planets");
    }
}

class planets extends solarSystem {
    public planets() {
        System.out.println("planets constructor");
    }

    public void contains() {
        System.out.println("contains living beings");
    }
}

class livingBeings extends planets {

    public static void main(String[] args) {
        livingBeings being = new livingBeings();
        being.contains();

    }

    public void contains() {
        System.out.println("contains life");
    }
}