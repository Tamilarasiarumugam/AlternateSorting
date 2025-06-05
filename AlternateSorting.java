package Practice;

public class AlternateSorting {
	
	public static int[] sort(int[] arr,int n)
	{
		int i,j,temp;
		for(i=0;i<n;i=i+2)
		{
			temp=arr[n-1];
			for(j=n-1;j>i;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[i]=temp;
		}
		return arr;
	}
	
	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			
				System.out.print(arr[i]+" ");
			
				
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		int[] res=sort(arr,n);
		printArr(res);
		
	}

}
