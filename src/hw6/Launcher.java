package hw6;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog1 = new Dog("Бобик", 10, "Вуф!");
        Dog dog2 = new Dog("Дружок", 5, "Гав!");

        Cat cat1 = new Cat("Барсик", 2, true);

        dog1.run(10);
        dog2.swim(11);
        cat1.run(300);

        System.out.println("Животных " + Animal.getAnimalCount());
        System.out.println("Собак " + Dog.getDogCount());
        System.out.println("Кошек " + Cat.getCatCount());
    }
}
