public class Main{
	
	
	static class LinearSearch{
		public static boolean isFound(final int[] ARRAY, final int SEARCH_VALUE)throws Exception{
			final int ARRAY_SIZE = ARRAY.length;
			if (ARRAY_SIZE < 1){
				throw new Exception("Empty Array given");
			}
			boolean found = false;
					
			for (int i = 0; i < ARRAY_SIZE; i++){
				if (ARRAY[i] == SEARCH_VALUE){
					found = true;
					break;
				}
			}
			
			return found;
		}
		public static int getIndex(final int[] ARRAY, final int SEARCH_VALUE)throws Exception{
			final int ARRAY_SIZE = ARRAY.length;
			if (ARRAY_SIZE < 1){
				throw new Exception("Empty Array given");
			}
			for (int i = 0; i < ARRAY_SIZE; i++){
				if (ARRAY[i] == SEARCH_VALUE){
					return i;
				}
			}
			
			throw new Exception("Value not found");
		}
	}
	
	static class BinarySearch{
		public static boolean isFound(final int[] ARRAY, final int SEARCH_VALUE)throws Exception{
			final int ARRAY_SIZE = ARRAY.length;
			if (ARRAY_SIZE < 1){
				throw new Exception("Empty Array given");
			}
			boolean found = false;
			int startIndex = 0;
			int endIndex = ARRAY_SIZE - 1;
			int midSearcher = (startIndex + endIndex) / 2;
			for (int i = 0; i < ARRAY_SIZE; i++){
				midSearcher = (startIndex + endIndex) / 2;
				if (ARRAY[midSearcher] == SEARCH_VALUE){
					found = true;
					break;
				}
				if (ARRAY[midSearcher] > SEARCH_VALUE){
					endIndex = midSearcher - 1;
				} else if (ARRAY[midSearcher] < SEARCH_VALUE){
					startIndex = midSearcher + 1;
				}
			}
			
			return found;
		}
		public static int getIndex(final int[] ARRAY, final int SEARCH_VALUE)throws Exception{
			final int ARRAY_SIZE = ARRAY.length;
			if (ARRAY_SIZE < 1){
				throw new Exception("Empty Array given");
			}
			boolean found = false;
			int startIndex = 0;
			int endIndex = ARRAY_SIZE - 1;
			int midSearcher = (startIndex + endIndex) / 2;
			for (int i = 0; i < ARRAY_SIZE; i++){
				midSearcher = (startIndex + endIndex) / 2;
				if (ARRAY[midSearcher] == SEARCH_VALUE){
					return midSearcher;
				}
				if (ARRAY[midSearcher] > SEARCH_VALUE){
					endIndex = midSearcher - 1;
				} else if (ARRAY[midSearcher] < SEARCH_VALUE){
					startIndex = midSearcher + 1;
				}
			}
			
			throw new Exception("Value not found");
		}
	}
	
	public static int[] getSortedArray(final int ARRAY_LENGTH)throws Exception{
		if (ARRAY_LENGTH < 1){
			throw new Exception("the Array Length must be positive integer");
		}
	
		int[] sortedArray = new int[ARRAY_LENGTH];
		for (int i = 0; i < ARRAY_LENGTH; i++){
			sortedArray[i] = i+1;
		}
		return sortedArray;
	}
	
	
	
	public static void main(String args[]){
		try {
		
		final int ARRAY_SIZE = 1000;
		int[] sortedArray = getSortedArray(ARRAY_SIZE);
		
		final int SEARCH_VALUE = 356;
		
		long startTime = System.nanoTime();
		
		boolean isFound = LinearSearch.isFound(sortedArray, SEARCH_VALUE);
		
		long endTime = System.nanoTime();
		
		long timeTaken = endTime - startTime;
		System.out.println("linear algorithm: ");
		System.out.println("the value is "+ (isFound ? "found": "not found"));
		System.out.println("time taken: " + timeTaken + " nano seconds");
		
		//-------------------------------------------------------------
		
		startTime = System.nanoTime();
		
		isFound = BinarySearch.isFound(sortedArray, SEARCH_VALUE);
		
		endTime = System.nanoTime();
		
		timeTaken = endTime - startTime;
		System.out.println("binary search algorithm: ");
		System.out.println("the value is "+ (isFound ? "found": "not found"));
		System.out.println("time taken: " + timeTaken + " nano seconds");
		
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}
		
	}
}
