public class Main {
    public static void main(String[] args) {
        try {
            Car smallCar = new Car(7, 1);
            Car mediumCar = new Car(12, 2);
            Car largeCar = new Car(17, 5);

            System.out.println("Small Car:");
            smallCar.draw();
            System.out.println("\nMedium Car:");
            mediumCar.draw();
            System.out.println("\nLarge Car:");
            largeCar.draw();

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
