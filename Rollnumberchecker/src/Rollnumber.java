import java.util.Scanner;
public class Rollnumber {

	public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			
				int[] a = {1,5,9,13,17,21};
				int[] b = {2,6,10,14,18,22};
				int[] c = {3,7,11,15,19,23};
				int[] d = {4,8,12,16,20,24};
				System.out.println("Input roll number ");
				//Roll number as input
				int roll = sc.nextInt();
				for(int i:a)
					{
					if(i==roll)
					{System.out.println("your group is Sapphire");}
					}
				for(int j:b)
					{
					if(j==roll)
					{System.out.println("your group is Pearl");}
					}
				for(int k:c)
					{
					if(k==roll)
					{System.out.println("your group is Ruby");}
					}
				for(int l:d)
					{
					if(l==roll)
					{System.out.println("your group is Emerald");}
					}
			}
		

	}


