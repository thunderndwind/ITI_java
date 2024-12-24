public class BinarySearch {
	public static boolean isFound(final int[] ARRAY, final int SEARCH_VALUE) throws Exception {
		final int ARRAY_SIZE = ARRAY.length;
		if (ARRAY_SIZE < 1) {
			throw new Exception("Empty Array given");
		}
		boolean found = false;
		int startIndex = 0;
		int endIndex = ARRAY_SIZE - 1;
		int midSearcher = (startIndex + endIndex) / 2;
		for (int i = 0; i < ARRAY_SIZE; i++) {
			midSearcher = (startIndex + endIndex) / 2;
			if (ARRAY[midSearcher] == SEARCH_VALUE) {
				found = true;
				break;
			}
			if (ARRAY[midSearcher] > SEARCH_VALUE) {
				endIndex = midSearcher - 1;
			} else if (ARRAY[midSearcher] < SEARCH_VALUE) {
				startIndex = midSearcher + 1;
			}
		}

		return found;
	}

	public static int getIndex(final int[] ARRAY, final int SEARCH_VALUE) throws Exception {
		final int ARRAY_SIZE = ARRAY.length;
		if (ARRAY_SIZE < 1) {
			throw new Exception("Empty Array given");
		}
		boolean found = false;
		int startIndex = 0;
		int endIndex = ARRAY_SIZE - 1;
		int midSearcher = (startIndex + endIndex) / 2;
		for (int i = 0; i < ARRAY_SIZE; i++) {
			midSearcher = (startIndex + endIndex) / 2;
			if (ARRAY[midSearcher] == SEARCH_VALUE) {
				return midSearcher;
			}
			if (ARRAY[midSearcher] > SEARCH_VALUE) {
				endIndex = midSearcher - 1;
			} else if (ARRAY[midSearcher] < SEARCH_VALUE) {
				startIndex = midSearcher + 1;
			}
		}

		throw new Exception("Value not found");
	}
}
