

public class bubble {

	public static void main(String[] args) {
		int a[]= {3,1,6,2,7};
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
