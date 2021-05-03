//This is a program to check binary

import java.util.Scanner;
class BSearch 
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
	int mid=0;
	int left=0, right=n-1;
	mid=(left+right)/2;
	int positn=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if (a[mid]==key)
		{
		positn=i;
		break;
		}
		else if (a[mid]>key)
		{
		left=a[mid]-1;
		positn=i;
		}
		else if (a[mid]<key)
		{
		right=a[mid]+1;
		positn=i;
		}
		else
		{
		positn= -1;
		}

	}
	if (positn<0)
	{
	System.out.println("The key element " +key+ " is not found in an array");
	}

	else if (positn>0 && a[mid]==key)
	{
	System.out.println("The key element " +key+ " found at the middle of an array");
	}
	else if(positn>0 && a[mid]>key)
	{
	System.out.println("The key element " +key+ " found in the left " +positn+ "  position of an array");
	}
	else
	{
	System.out.println("The key element " +key+ " found in the right " +positn+ " position of an array");
	}
	
}
}