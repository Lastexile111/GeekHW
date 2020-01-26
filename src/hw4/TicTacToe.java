package hw4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';



    public static void main( String[] args){

        final int SIZE = getSize();
        char[][] field = new char[SIZE][SIZE];
        int turn = 0;


        fillField(field);
        printFieldStatus(field);

        do{
            player(field);
            printFieldStatus(field);
            turn++;

            if(turn == (SIZE*SIZE)){
                break;
            }

            System.out.println("");

            ai(field);
            printFieldStatus(field);
            turn++;

            if(turn == (SIZE*SIZE)){
                break;
            }

        }while(!(isWinner(field, DOT_X))||(isWinner(field, DOT_O)));

        if(isWinner(field, DOT_X)){
            System.out.println("Победил Игрок");
        }else if(isWinner(field, DOT_O)){
            System.out.println("Победил AI");
        }else{
            System.out.println("Ничья");
        }
    }


    private static int getSize(){
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.println(" Введите размер поля");
        if(scanner.hasNext()) {
            size = scanner.nextInt();
            return size;
        }

        return -1;
    }

    private static void fillField(char[][] field){
        int size = field.length;

        for(int row = 0; row < size; row++ ){
            for(int column = 0; column < size; column++){
                field[row][column] = DOT_EMPTY;
            }
        }
    }

    private static void printFieldStatus(char[][] field){
        int size = field.length;
        for(int row = -1; row < size; row++ ){
            if(row == -1){
                System.out.print("     ");
            }else{
                int number = row + 1;
                System.out.print(number + "    ");
            }
            for(int column = 0; column < size; column++){
               if(row == -1){
                   int number = column + 1;
                   System.out.print(number + "  ");
               }else{
                   System.out.print(field[row][column] + "  ");
               }
            }
            System.out.println("");
        }
    }

    private static void player(char[][] field){
        Scanner scanner = new Scanner(System.in);
        int rowNumber,colNumber = 0;
        do{
            System.out.println("Введи номер строки и столбца");
            rowNumber = scanner.nextInt();
            colNumber = scanner.nextInt();
        }while (!isCellValid(field, rowNumber - 1, colNumber - 1));
        field[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void ai(char[][] field){
        Random random = new Random();
        int size = field.length;
        int rowNumber,colNumber = 0;
        do{
            rowNumber = random.nextInt(size);
            colNumber = random.nextInt(size);
        }while (!isCellValid(field, rowNumber, colNumber));
        field[rowNumber][colNumber] = DOT_O;
    }

    private static boolean isCellValid(char[][] field, int rowNumber, int colNumber){
        char cell = field[rowNumber][colNumber];
        if(cell == DOT_EMPTY){
            return true;
        }
        return false;
    }

    private static boolean isWinner(char[][] field, char dot){
        int size = field.length;
        int[] lines = new int[size];
        int[] column = new int[size];
        int diag1 = 0;
        int diag2 = 0;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(field[i][j] == dot){
                    if(i == j){
                        diag1++;
                    }
                    if(j == (size - 1 - i)){
                        diag2++;
                    }
                    lines[i]++;
                    column[j]++;
                }
            }
        }

        for(int i = 0; i < size; i++) {
            if ((lines[i] == size) || (column[i] == size)) {
                return true;
            }
        }
        if((diag1 == size)||(diag2 == size)){
            return true;
        }
        return false;
    }


}
