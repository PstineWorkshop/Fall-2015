/*
 The assigment is to take two arrays and put them togather.
 The first array to be passed in has its elements go first followed by the next array's elements

*/
public class ConcatenateArrays
{
	public static void main(String[] args)
	{
		int[] t1 = { 3, 2, -1, 4 };
		int[] t2 = { 9, -7 };
		 //Uncomment the next two lines:
		int[] t = concatenateArrays(t1, t2);
		printArray(t);

		int[] v1 = { -4, -4, 0, -4, 2 };
		int[] v2 = { -4, -4, 0, -4, 2, 9, 15 };
		// Uncomment the next two lines:
		int[] v = concatenateArrays(v1, v2);
		printArray(v);

		// Do not uncomment these lines:
		// If you coded this correctly, your output should be: 
		// 3 2 -1 4 9 -7 
		// -4 -4 0 -4 2 -4 -4 0 -4 2 9 15
	}

	public static int[] concatenateArrays(int[] a, int[] b){// start of method
		int length=a.length+b.length;
      
      		int[] combo=new int[length];
		int i;
		int j;
		//int x=a.length;
		//int z=b.length;
    		 int count=0;
      
       		//if(a.length>b.length)
        	// {// start of if
            	for(i=0;i<length;i++){
              	 combo[i]=a[i];                
                 count++;
                 if(count==a.length){
                  i=length;
                 }
           	}
               for(i=0;i<b.length;i++) {
       		combo[x]=b[i];
                 ++x;
     	       }
           return combo;
    }// end of method

	public static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
