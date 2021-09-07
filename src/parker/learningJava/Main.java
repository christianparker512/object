package parker.learningJava;

public class Main {

    public static void main(String[] args) {
        Car jaguar = new Car();
        Car infinity = new Car();
        jaguar.setModel("XKR");
        System.out.println("The car's model is " + jaguar.getModel());
    }
}
