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
	
