package org.example;
import java.util.Arrays;
public class question3 {
    public static void main(String [] args) {

        double[] arrayNum = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        System.out.print("Array Values: \n");




    //3a
        //Solution to Find the Mean
        double Mean = findMean(arrayNum);
        System.out.print("Average= " + Mean + "\n");
    //3b
        //Solution to Find the Median
        double Median = findMedian(arrayNum);
        System.out.print("Median= "+Median+"\n");
    //3c
        //Solution To Find the Standard Deviation
        double StandardDeviation = findStandardDeviation(arrayNum, Mean);
        System.out.print("Standard Deviation= " + StandardDeviation+"\n");



    }
    public static double findMedian(double[] arr){
        //Sort the Array
        Arrays.sort(arr);
        int length = arr.length;

        if(length % 2 == 0){ //Check if it's an Even number
            return (arr[(length / 2) - 1] + arr[length / 2]) / 2.0;
        }else{ //Execute if it's an Odd Number
            return arr[(length/2)];
        }
    }
    public static double findMean(double[] arr){
        double sum = 0;
        double mean;
        for (double i : arr) {
            System.out.print(i + "\n");
            sum += i;
        }
        System.out.println();
        mean = sum / arr.length;
        return mean;
    }
    public static double findStandardDeviation(double[] arr, double Mean){
        double sumOfSquaredDiff = 0;
        for (double number : arr) {
            sumOfSquaredDiff += Math.round(Math.pow(number - Mean, 2));
        }

        double variance = sumOfSquaredDiff / arr.length;
        return Math.sqrt(variance);
    }


}
