package JavaCodesRevise;

public class MoveAllZerosToLeft {

	public static void main(String[] args) {
		
		int a[] = {1,2,0,4,0,40,6,0};
		int b[] = new int[a.length];
		int count =0;
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[i]=a[i];
				count++;
			}
		}
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[count++] = a[i];
			}
		}
		for(int i:b) {
			System.out.print(i);
		}
		

	}

}
