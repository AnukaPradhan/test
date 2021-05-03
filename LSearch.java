import java.util.Scanner;
class LSearch 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		
	for(int i=0;i<=n-1;i++)
	{
	System.out.println("Enter the " +(i+1)+ " element");
	a[i]=scan.nextInt();
	}

	System.out.println("Enter the key value");
	int key= scan.nextInt();
	int positn=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if (a[i]==key)
		{
		positn=i;
		break;
		}
		else
		{
		positn=-1;
		}

	}

	if (positn<0)
	{
	System.out.println("The key element " +key+ "does not found in array");
	}
	else
	{
	System.out.println("The key element " +key+ " found in the " +positn+ " position");
	}
}
}
