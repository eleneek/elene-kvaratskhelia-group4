package Task1;

import java.util.Arrays;
import java.util.Random;

public class Task1  implements  ITask1{
    int a,b;
    int[][] m = new int[5][5];
    Random random = new java.util.Random();
    @Override
    public void assignValues() {
        int min = -100;
        int max = 100;
        a = random.nextInt(max - min) + min;
        b = random.nextInt(max - min) + min;
        System.out.println(a);
        System.out.println(b);
    }
    @Override
    public void assignValuesToArray() {
        int maximum;
        int minimum;
        if(a > b) {
            maximum = a;
            minimum = b;
        } else {
            maximum = b;
            minimum = a;
        }
        for(int i = 0; i<m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                int number = random.nextInt(maximum - minimum) + minimum;
                m[i][j] = number;
            }

        }
    }

    public int[] getMaximums() {
        int[] firstArr = m[0];
        int[] secondArr = m[1];
        int firstMax = firstArr[0];
        int secondMax = secondArr[0];

        int[] arrayOfMaxs = new int[5];

        for(int i = 0; i<m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
               if(m[i][j] > arrayOfMaxs[i]){
                   arrayOfMaxs[i] = m[i][j];
               }
            }

        }

        return  arrayOfMaxs;
    }

    public void printValuesOfArray(){
        for(int i = 0; i<m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.println("Array -" +  Arrays.toString(m[i]) + "- Element" + m[i][j] + "- Index" + j);
            }

        }
    }

    public int getNumOfSevenDivisions(){
        int total = 0;
        for(int i = 0; i<m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
               if(m[i][j] == 7) {
                   total +=1;
               }
            }

        }
        return total;
    }

}
