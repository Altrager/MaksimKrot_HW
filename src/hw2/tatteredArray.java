package hw2;


import java.util.Arrays;

public class tatteredArray {
    public static void main(String[] args) {
        int n = (int) Math.random();
        int n2 = (int) Math.random();
        int [][] tatterArray = int [n][n2];
        System.out.println(Arrays.deepToString(tatterArray));
        for (int i = 0; i < tatterArray[n].length; i++) {
            for (int j = 0; j < tatterArray[n2].length; j++){
                //не знаю, как заполнить рваный массив рандомными числами
            }
        }
    }
}
