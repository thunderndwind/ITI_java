import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.StringTokenizer;

public class Main {
	
	
	
	static class SequenceCounter{
		public static int countWithIdexOf(final String SENTENCE, final String WORD) throws Exception{
			if (!SENTENCE.contains(WORD))
				return 0;
				
			int count = 1;
			int lastIndex = SENTENCE.indexOf(WORD);
			int strLength = SENTENCE.length();
			for (int i = lastIndex; i < (strLength); i++){
				if (lastIndex < (strLength)){
					if (SENTENCE.indexOf(WORD, lastIndex+1) != -1){
						count+=1;
						lastIndex = SENTENCE.indexOf(WORD, lastIndex+1);
					}
						
				}
			}
			
			return count;
		}
		
		public static int countWithSplit(final String SENTENCE, final String WORD) throws Exception{
			if (!SENTENCE.contains(WORD))
				return 0;
				
			String[] array = SENTENCE.split(WORD);
			
			int size = array.length;
			for (int i = 0; i< array.length; i++){
				if (array[i].isEmpty()){	
					size -= 1;
				}
			}
			
			return size;
		}
		
		public static int countWithEqual(final String SENTENCE, final String WORD) throws Exception{
			if (!SENTENCE.contains(WORD))
				return 0;
			String[] temp = SENTENCE.split(" ");
			
			int count = 0;
			for (int i = 0; i < temp.length; i++) {
			if (WORD.equals(temp[i]))
			count++;
			}
			return count;
			
		}
		
		public static int countWithPattern(final String SENTENCE, final String WORD) throws Exception{
			if (!SENTENCE.contains(WORD))
				return 0;
			
			Pattern pattern = Pattern.compile(WORD, Pattern.CASE_INSENSITIVE);
    			Matcher matcher = pattern.matcher(SENTENCE);
    			
			int count = 0;
    			while(matcher.find())
    				count++;

			return count;
			
		}
		
		public static int countWithTokenizer(final String SENTENCE, final String WORD) throws Exception{
			if (!SENTENCE.contains(WORD))
				return 0;
			StringTokenizer tokenizer = new StringTokenizer(SENTENCE, WORD);

			int count = 0;
    			while(tokenizer.hasMoreTokens()){
    				tokenizer.nextToken();
    				count++;
    			}

			return count;
			
		}
	}
	
	public static void main(String args[]){
		try{
			final String SENTENCE = "ITI develops people and ITI house of developers and ITI for people";
			final String WORD = "ITI";
			
			System.out.println("using split count: ");
			System.out.println("occurence of " + WORD + " is " + SequenceCounter.countWithSplit(SENTENCE, WORD));
			
			System.out.println("using split equals: ");
			System.out.println("occurence of " + WORD + " is " + SequenceCounter.countWithEqual(SENTENCE, WORD));
			
			System.out.println("using split regex: ");
			System.out.println("occurence of " + WORD + " is " + SequenceCounter.countWithPattern(SENTENCE, WORD));
			
			System.out.println("using string tokenizer: ");
			System.out.println("occurence of " + WORD + " is " + SequenceCounter.countWithTokenizer(SENTENCE, WORD));
			
			System.out.println("using index of: ");
			System.out.println("occurence of " + WORD + " is " + SequenceCounter.countWithIdexOf(SENTENCE, WORD));
			
		} catch(Exception exc){
			System.out.println(exc.getMessage());
		}
		
	}
}

