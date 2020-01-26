package hw3;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] word ={ "apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        String str = word[random.nextInt(25)];

        boolean flag = true;
        while (flag) {
            System.out.println("Введите слово");
            if(scanner.hasNext()){
                String attempt = scanner.nextLine();
                if(str.equals(attempt)){
                    System.out.println("Верно!");
                    flag = false;
                    break;
                }else{
                    System.out.println("Не верно");

                    String result = "";
                    int n = 0;
                    if(str.length() >= attempt.length()){
                        n = attempt.length();
                    }else{
                        n = str.length();
                    }

                    for(int i = 0; i < n; i++){
                        char a = str.charAt(i);
                        char b = attempt.charAt(i);
                        if(a == b){
                            result += a;
                        }else{
                            result += '#';
                        }
                    }

                    for(int i = 0; i < (15 - n); i++){
                        result += '#';
                    }
                    System.out.println(result);
                }
            }
        }
    }
}
