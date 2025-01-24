package org.example;
import java.util.Scanner;

public class question4{
    public static void main(String [] args){
    // Question 4
        Scanner input = new Scanner(System.in);
        int [] num = new int[10];
        for (int i = 0; i<num.length;i++){
            System.out.print("Enter value for index: "+ (i+1) +" ");
            num[i] = input.nextInt();

        }

        //for each loop
        System.out.println("\n");
        for (int i : num) {
            System.out.print(i + "\t");
        }



    }
}