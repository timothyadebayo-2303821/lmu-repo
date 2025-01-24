package org.example;
import java.util.Scanner;

public class question5 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        // Question 5

        int [][] num2 = new int[10][10];
        for(int a = 0; a<num2.length;a++){
            for (int b = 0; b< num2[a].length; b++){
                System.out.print("Enter value for index "+(a+1)+","+(b+1)+" :");
                num2 [a][b] = input.nextInt();
            }
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
