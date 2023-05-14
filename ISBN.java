import java.util.Scanner;
// Option 4 of section C.

/*Steps of compiling java file on the Microsft Window 10 are as follows:
1. Name the file of your programming code as the same as the name of your class with java extenction.
2. Go to the library fold where you saved your file and click on it.
3. On the bar,next to search bar, that is written a folder name  where you saved your file, use your mouse to point the bar, 
until the folder name is highleted and then type cmd.
4. The cmd execution will appear on your screen with directory of your folder name where you saved your file.
5. Next to the arrow type javac and the name of your file with extenction, press enter.
6. The same line will appear as before with directoryof your file name which states that there are no error on your code
 but now you will type java and the name of your file without extenction.
7. The code will run perfectyl.
*/ 

public class ISBN
{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		
		int[] isbn_10=new int[10];
		
		System.out.println("Enter your ISBN_10 number : ");//Test for ISBN 10
		for(int i=0;i<10;i++)
		{
			isbn_10[i]= input.nextInt();
			
		}
		
		ISBN_10(isbn_10,10);
			
	}
	
	public static void ISBN_10(int[] arr,int size)
	{
		int sum=0;
		int sumTot=0;
		int sumEve=0;
		int sumOdd=0;
		int sumTotEve=0;
		int sumTotOdd=0;
		int remainder=0;
		int lastNumber=0;
		int[] isb_9= new int[12];//ISBN9 after dropping the value of the valid ISBN
		int[] isb_code = {9,7,8};//General number of isbn 13
		int [] isb_12= new int[isb_code.length+isb_9.length];//ISBN array connecting the isbn code and and ISBN 9
		int [] isb_13= new int[isb_12.length+1];//ISBN array of the converted  valid ISBN 10 to ISBN 13
		for(int i=0;i<size;i++)
		{
			sum = (10-i)*arr[i];
			sumTot+=sum;
		}
		
		
		if(sumTot%11==0)
		{
			for(int i=0;i<10-1;i++)
			{
				isb_9[i]=arr[i];
			
			}
			
			for(int i=0;i<(isb_code.length);i++)
			{
				isb_12[i]= isb_code[i];
			}
			
			for(int i=0;i<isb_9.length;i++)
			{
				isb_12[isb_code.length+ i]=isb_9[i];
			}
			
			//Convertion 
			
			for(int i=0;i<12;i++)
			{
				if(i%2==0)
				{
					sumEve=isb_12[i]*1;
					sumTotEve+=sumEve;
				}
				
			}
		
			for(int i=0;i<12;i++)
			{
				if(i%2 != 0)
				{
					sumOdd=isb_12[i]*3;
					sumTotOdd+=sumOdd;
				}
			}
			int totSumm = sumTotEve+sumTotOdd;
			remainder=totSumm%10;
			lastNumber=10-remainder;
			
			System.out.print("\n"+ totSumm+ " "+remainder+" "+lastNumber);			
			
			for(int i =0;i<isb_12.length;i++)
			{
				isb_13[i]=isb_12[i];
			}
		
			
			isb_13[12]=lastNumber;
			
			System.out.print("\nThe converted ISBN 10 t0 ISBN 13is :\n");
			
			for(int i=0;i<13;i++)
			{
				System.out.print(" "+isb_13[i]);
			}
			
			System.out.print("\n Checking the converted ISBN 10 to 13 is Valid: \n");
			ISBN_13(isb_13,13);
			System.out.print("\n");
			
			
			System.out.println( "Valid ISBN 10");
				
		}
		else
		{
			System.out.println( "Invalid ISBN 10");
		}
	
		
	}
	
	public static void ISBN_13(int[] arr, int size)
	{
		int sumEve=0;
		int sumOdd=0;
		int sumTotEve=0;
		int sumTotOdd=0;
		
		
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
				sumEve=arr[i]*1;
				sumTotEve+=sumEve;
			}
				
		}
		
		for(int i=0;i<size;i++)
		{
			if(i%2 != 0)
			{
				sumOdd=arr[i]*3;
				sumTotOdd+=sumOdd;
			}
		}
		int totSum = sumTotEve+sumTotOdd;
		
		if(totSum%10==0)
		{
			System.out.println("Valid ISBN 13");
		}
		
		else
		{
			System.out.println("Invalid ISBN 13");
		}
		
	}
	
}

