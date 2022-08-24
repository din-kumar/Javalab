import java.util.*;                    

public class Secondlargest {               

	public static void main(String[] args) {     
	
		//Initializing and declaring array of type Int
		int[] number= {25,14,36,56,15,77,18,29,49};
	
		Arrays.sort(number);
		
		int sec_max = 0;
		
        for(int i=0;i<number.length;i++)              //Using for loop to access array elements
        {
        	if(number[i]!=number[number.length-1])                
        	{
        		sec_max=number[i];                      //assigning matched array_elemnet value to sec_max
        		
        	 }
        }	
        
       System.out.println(sec_max+" is second largest number in the array");	  //Printing the Second largest number from array
	}

}           