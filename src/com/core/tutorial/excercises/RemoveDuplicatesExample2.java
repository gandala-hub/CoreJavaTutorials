package com.core.tutorial.excercises;
//Import packages   
import java.util.Arrays;   
//Create RemoveDuplicatesExample2 class   
public class RemoveDuplicatesExample2    
{   
  //Create removeDuplicates() method to remove duplicate characters from sorted array  
  static void removeDuplicates(String str)   
  {   
      //index to track the location of next character(Input string)  
      int index1 = 1;          
        
      // index to track the location of next character(Resultant string)  
      int index2 = 1;  
          
      // Convert string to character array for further manipulation  
      char arr[] = str.toCharArray();   
          
      //Check whether the character is present before it or not. If it is not present before, add it to the result string  
      while (index1 != arr.length)   
      {   
          if(arr[index1] != arr[index1-1])   
          {   
              arr[index2] = arr[index1];   
              index2++;   
          }   
          index1++;   
            
      }   
      
      str = new String(arr);  
      System.out.println(str.substring(0, index2));   
  }   
       
  //Create sortString() method to sort string  
  static String sortString(String str)   
  {   
     // Convert string to character array to sort it   
     char temp[] = str.toCharArray();   
       
     //sort array using array's sort () method  
     Arrays.sort(temp);   
       
     //Generate a new string from character array   
     str = new String(temp);   
         
     // Return the sorted string  
     return str;   
  }   
       
  // main() method start  
  public static void main(String[] args)   
  {   
      //create string variable with a default string   
      String str = "javaTpoint is the best learning site";   
        
      //Call sortString() method to sort the string characters  
      String newString = sortString(str);   
      System.out.println(newString);  
        
      //Call removeDuplicates() method to remove duplicates from the sorted string  
      removeDuplicates(newString);  
  }   
}  