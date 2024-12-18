class Main{
	public static int getMax(final int ARRAY[]) throws Exception{
		final int ARRAY_LENGTH = ARRAY.length;
		if (ARRAY_LENGTH < 1){
			throw new Exception("Empty Array given");
		}
		int maxNumber = Integer.MIN_VALUE;
		for (int i = 0; i < ARRAY_LENGTH; i++){
			if (ARRAY[i] > maxNumber){
				maxNumber = ARRAY[i];
			}
		}
		return maxNumber;
	}
	
	public static int getMin(final int ARRAY[]) throws Exception{
		final int ARRAY_LENGTH = ARRAY.length;
		if (ARRAY_LENGTH < 1){
			throw new Exception("Empty Array given");
		}
		int minNumber = Integer.MAX_VALUE;
		for (int i = 0; i < ARRAY_LENGTH; i++){
			if (ARRAY[i] < minNumber){
				minNumber = ARRAY[i];
			}
		}
		return minNumber;
	}
	
	public static int[] getRandomArray(final int ARRAY_LENGTH) throws Exception{
		if (ARRAY_LENGTH < 1){
			throw new Exception("the Array Length must be positive integer");
		}
		int[] randomArray = new int[ARRAY_LENGTH];
		for (int i = 0; i < ARRAY_LENGTH; i++){
			randomArray[i] = (int) (Math.random() * 1000) + 1;
		}
		return randomArray;
	}
	
	public static void main(String args[]){
		try{
			// Define random array
			final int ARRAY_SIZE = 1000;
			int[] randomArray = getRandomArray(ARRAY_SIZE);
			
			// Start Timer
			long start = System.nanoTime();
			
			// Get min max numbers
			int maxNumber = getMax(randomArray);
			int minNumber = getMin(randomArray);
			
			long end = System.nanoTime();
			
			// Calculate calculation time
			long timeTaken = end - start;
			
			System.out.println("max Nubmer = " + maxNumber + "\n" + "min Nubmer = " + minNumber + "\n" + "time taken: " + timeTaken + " nano seconds");
			
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}
		
	}
}

