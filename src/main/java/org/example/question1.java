package org.example;

public class question1 {
    public static void main(String [] args){

        //Single for loop
        System.out.println("Single loop: Nigerian Flag\n");

        String Nigerian_Flag = "* * * * = = = = * * * *";

        for (int i = 0; i<4; i++){
            System.out.println(Nigerian_Flag);
        }
        System.out.print("\n");


        //nested for loop
        System.out.println("Nested loop: Nigerian Flag");

        for(int i = 0;i<4;i++){
            for (int j = 0; j<12;j++){
                if (j==4 || j==5 || j==6 || j==7){
                    System.out.print("= ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
            
        }

    }
}
