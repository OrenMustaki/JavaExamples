
public class ArrayMinMax {
	
	public int min;
	public int max;
	public ArrayMinMax(int array[])
	{
		min = array[0];
		max = array[0];
		for(int i=0 ; i<array.length ; i++)
		{
			if(max < array[i])
				max = array[i];
			if(min > array[i])
				min = array[i];			
		}

	}
}
