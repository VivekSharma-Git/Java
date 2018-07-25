
public class Merge {
	static int arrsort[];
	
	public int merge(int arr[],int left[], int right[]) {
		int count =0;
		int i =0;
		int j =0;
		int k =0;
		int nl = left.length;
		int nr = right.length;
		while(i<nl && j<nr)
		{
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				k++;
				i++;
			}
			else {
				arr[k] = right[j];
				k++;
				j++;
				count += (nl -i);
			}
		}
		while(i<nl)
		{
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<nr)
		{
			arr[k] = right[j];
			j++;
			k++;
		}
	   arrsort = arr.clone();
	   return count;
	
	}
	
	public int mergesort(int arr[]) {
		int count =0;
		int n = arr.length;
		if(n<2)
		{
			return 0;
		}
	    int mid = n/2;
	
	    int left[] = new int[mid];
	    int right[] = new int[n-mid];
	    for(int i =0; i<mid; i++)
	    {
	    	left[i]= arr[i];
	    }
	    for(int i =mid; i<n; i++)
	    {
	    	right[i-mid] = arr[i];
	    }
	   
	
	   count +=  mergesort(left);
	   count += mergesort(right);
		
	   count += merge(arr,left,right);
	   return count;
	   
	}

	public static void main(String[] args) {
		int arr[] = new int[]{5,6,1,3,7,4,2,8};
		System.out.println("Unsorted array");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		arrsort = new int[arr.length];
		Merge m = new Merge();
		int count =m.mergesort(arr);
		System.out.println("\nSorted array");
		for(int i =0; i<arrsort.length;i++)
		{
			System.out.print(" "+arrsort[i]);
		}
		System.out.println(count);

	}

}
