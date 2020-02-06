package hw7;

public class MainClass {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 7),
                new Cat("Рыжик", 10),
                new Cat ("Муся", 8),
                new Cat ("Baby Yoda", 3)
        };
        Plate plate = new Plate(20);

        for(int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
            cats[i].info();
            System.out.println("");
        }

        plate.addFood(10);

        for(int i = 0; i < cats.length; i++){
            cats[i].eat(plate);
            cats[i].info();
            System.out.println("");
        }

    }
}
