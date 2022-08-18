import java.util.Scanner;
public class Rollnumber {

	public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
				System.out.println("Input roll number ");
				//Roll number as input
				int roll = sc.nextInt();
				int a=1,b=2,c=3,d=4;
				int x=0;
				do
				{
					if(roll==a)
					{
						System.out.println("Sapphire ");
						x=1;
					}
					if(roll==b)
					{
						System.out.println("Pearl ");
						x=1;
					}
					if(roll==c)
					{
						System.out.println("Ruby ");
						x=1;
					}
					if(roll==d)
					{
						System.out.println("Emerald");
						x=1;
					}
					a+=4;
					b+=4;
					c+=4;
					d+=4;
				}while(x==0);
			}
		}