/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Mohamad
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scan
        Scanner input = new Scanner(System.in);
        // ask for the two integers
        System.out.println("Enter two integers:");
        // create the array
        int numbers[] = new int[2];
        // get the two integers
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        // if the first integer is bigger than the second then switch places
        if(numbers[0] > numbers[1]){
            numbers[1] = numbers[0];
            numbers[0] = numbers[1];
        }
        // display the result
        System.out.print("the integers in ascending order are: " + numbers[0] + " " + numbers[1]);
    }
    
}
