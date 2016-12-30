/*
 */
package arrayoperations;

import java.util.Random;

/**
 *
 * @author Yaritza
 */
public class ArrayOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int x;//intialize x
        int[] listofarrayx; //intializing x as a list in an array
        listofarrayx = new int[10000];
        for (int i = 0; i < listofarrayx.length; i++) {//i is set to 0,and less then the length,add 1
            listofarrayx[i] = rnd.nextInt(201); //chooses a random number from 0 to 200
        }
        
        int sum = 0;//initializes sum and sets it to 0
        for (int i = 0; i < listofarrayx.length; i++) {//i is set to 0,and less then the length,add 1 for loop
            sum = sum + listofarrayx[i];//computes sum
        }
        System.out.println("The sum of the Array is: " + sum);//prints sum of array
        
        int sum1 = 0; 
        for (int i = 0; i < listofarrayx.length; i++) {//i is set to 0,and less then the length,add 1 for loop
            sum1 = sum1 + listofarrayx[i];//computes second sum
        }
        
        double average = 0; //intializes the average
        average = sum1 / (double) listofarrayx.length;//computes the average
        System.out.println("The average of the Array is: " + average);//prints average
        
        int min = listofarrayx[0];//intialize min value
        int index = 0;//intializes min value for index
        for(int i = 0; i < listofarrayx.length; i++){//for loop if
            if(listofarrayx[i] < min){ //if whatever it computes as the min is greater then array
                min = listofarrayx[i];//computes min
                index = i;//computes index for min
            }
        }
        System.out.println("The min of the Array is: " + min + " and its index is " + index);//prints out min
        
        int max = listofarrayx[0];//intialize max value
        int indx = 0;//intializes max value for index
        for(int i = 0; i < listofarrayx.length; i++){//for loop if
            if(listofarrayx[i] > max){ //if whatever it computes as the max is less then array
                max = listofarrayx[i];//computes max
                indx = i;//computes index for max
            }
        }
        System.out.println("The max of the Array is: " + max + " and its index is " + indx);//prints out max
        
        int even = 0; //intializing even number
        int odd = 0;//intializing odd number
        for (int i = 0; i < listofarrayx.length; i++) {//i is set to 0,and less then the length,add 1
            if (listofarrayx[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("The Array contains " +  even + " even numbers ");
        System.out.println("The Array contains " +  odd + " odd numbers ");
    }
}
