package org.example;
import java.util.Scanner;

public class question5 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        // Question 5

        int [][] num2 = new int[4][4];
        for(int a = 0; a<num2.length;a++){
            for (int b = 0; b< num2[a].length; b++){
                System.out.println("Enter the values for index "+a+","+b);
                num2 [a][b] = input.nextInt();
            }
        }

        //for loop method
        for (int c=0;c< num2.length;c++) {
            for(int d=0;d<num2[c].length;d++) {

                System.out.print(num2[c][d]+"\t");
            }
        System.out.print("\n");
        }

        //for each method
        for(int [] i : num2){
            for(int j : i){
                System.out.print(j+"\t");
            }
        System.out.print("\n");
        }


    }
}
