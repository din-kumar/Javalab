public class Index {          

	public static void main(String[] args) {  
		
		
		//Initializing and declaring array of type Int
        int[] arr= {75,4,56,5,36,100,77,18,29,94};
        
		for(int i=0;i<arr.length;i++)   //Using For loop to access array elements
		{
			
		if(arr[i]==100)         //Checking whether 100 belongs to array
		 {			
		     
			//Printing 100 with its index Position
		   System.out.println("100 is at "+i + "th index");
		
		 }    
		}
	}
}
	

