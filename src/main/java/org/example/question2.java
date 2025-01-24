package org.example;

public class question2 {
    public static void main(String[]args){


        //Single Loop
        String flag1 = "* * * * = = = = = =";
        String flag2 = "= = = = = = = = = =";

        System.out.println("Single loop: Flag");
        for (int i = 0;i<6;i++){
            if(i<3){
                System.out.println(flag1);
            }else{
                System.out.println(flag2);
            }
        }

        //Nested Loop
        System.out.println("\nNested loop: Flag");
        char flag = '*';
        for (int i = 0;i<6;i++){
            for(int j = 0;j<10;j++){
                if(i==0&&j==0 || i==0&&j==1 || i==0&&j==2 ||i==0&&j==3 || i==1&&j==0 || i==1&&j==1 || i==1&&j==2 ||i==1&&j==3|| i==2&&j==0 || i==2&&j==1 || i==2&&j==2 ||i==2&&j==3) {
                    System.out.print(flag + " ");
                }else{
                    System.out.print("= ");
                }
            }
            System.out.print("\n");
        }

    }
}
