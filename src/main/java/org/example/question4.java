package org.example;
import java.util.Scanner;

public class question4{
    public static void main(String [] args){
    // Question 4
        Scanner input = new Scanner(System.in);
        int [] num = new int[10];
        for (int i = 0; i<num.length;i++){
            System.out.println("Enter the values for index "+ i);
            num[i] = input.nextInt();

        }
        // for loop
        for(int i=0; i< num.length;i++){
            System.out.print(num[i]+"\t");
        }
        //for each loop
        System.out.println("\n");
        for (int i : num) {
            System.out.print(i + "\t");
        }



    }
}