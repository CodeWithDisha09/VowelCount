/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activityicetask6.vowelcount;
import java.util.Scanner;
/**
 *
 * @author disha
 */
public class ActivityIceTask6VowelCount {
    
    //Function to count the number of vowels in a given string
public static int countVowels(String sentence){
    //Convert the sentence to lowercase to make vowel matching easier
    sentence = sentence.toLowerCase();
    
    //Initialize a counter for vowels
    int vowelCount =0;
    //Define a string containing all vowels 
    String vowels ="aeiou";
    
    //Loop through each character of the sentence 
    for (int i=0; i< sentence.length(); i++){
        //check if the current character is a vowel
        if(vowels.indexOf(sentence.charAt(i)) != -1){
            //If it is,increment the vowel count
            vowelCount++;
        }
    }
    
    //Return the total count of vowels 
    return vowelCount;
}


    public static void main(String[] args) {
        //Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        //Prompt the user to enter a sentence
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        
        //Call the countVowels function and store the result
        int result = countVowels(sentence);
        
        //Display the result
        System.out.println("The number of vowels in the given sentence is: "+result);
        
    }
}
