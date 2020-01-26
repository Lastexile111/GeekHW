package hw3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean flag = true;
        while (flag) {

            int x = random.nextInt(10);

            for (int i = 1; i < 4; i++) {
                System.out.println("Введите число от 0 до 9");
                int number = 0;
                if (scanner.hasNext()) {
                    number = scanner.nextInt();
                    if (x == number) {
                        System.out.println("Верно!");
                        flag = false;
                        break;
                    } else {
                        System.out.println("Не верно! Осталось " + (3 - i) + " попыток.");
                        continue;
                    }
                }


            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            if (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number == 0) {
                    flag = false;
                }else{
                    flag = true;
                }
            }

        }
    }
}
