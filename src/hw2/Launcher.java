/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк
и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный
элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный
массив, метод должен вернуть true, если в массиве есть место, в котором сумма
левой и правой части массива равны.
Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
checkBalance([1, 1, 1, || 2, 1]) → true,
граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить
все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться
вспомогательными массивами.
 */

package hw2;

import java.sql.SQLOutput;

public class Launcher {

    public static void main(String[] args){

        int[] arr1 = {6, 1, 5, 1, 8, 2, 9, 4, 3, 3};
        int[] arr2 = {2, 2, 2, 1, 2, 2, 10, 1};
        changer();
        filler();
        multiplier();
        crossFiller();
        minMax(arr1);
        System.out.println(checkBalance(arr2));
        displace(arr2, -2);


    }

    public static void changer(){
        byte[] binaryArr = new byte[] {1,1,0,0,1,0,1,1,0,0};

        for(int i = 0; i < binaryArr.length; i++ ){
            if(binaryArr[i] == 1){
                binaryArr[i] = 0;
            }else{
                binaryArr[i] = 1;
            }
            System.out.print(binaryArr[i] + " ");
        }
        System.out.println();

    }

    public static void filler(){
        byte[] arr = new byte[8];

        for(byte i = 0; i < arr.length; i++){
            arr[i] = (byte)(i * 3);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void multiplier(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void crossFiller(){
        int[][] arr = new int[6][6];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((j == i) || (j == (arr.length - (i + 1)))){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min = " + min +" : max = " + max);
    }

    public static boolean checkBalance(int[] arr){
        int left = 0;
        for(int i = 0; i < arr.length - 1; i++){
            left += arr[i];
            int right = 0;
            for(int j = i + 1; j < arr.length; j++){
                right += arr[j];
            }
            if(left == right){
                return true;
            }
        }
        return false;
    }

    public static void displace(int[] arr, int n){
        if(n >= 0){
            for(int i = 0; i < n; i++){
                int cash = arr[arr.length-1];

                for(int j = arr.length - 1; j > 0; j--){
                    arr[j] = arr[j - 1];
                }
                arr[0] = cash;
            }
        }else{
            for(int i = n; i < 0; i++){
                int cash = arr[0];

                for(int j = 1; j < arr.length ; j++){
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 1] = cash;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
