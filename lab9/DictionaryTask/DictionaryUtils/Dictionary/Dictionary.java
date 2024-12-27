package lab9.DictionaryTask.DictionaryUtils.Dictionary;

import lab9.DictionaryTask.DictionaryUtils.Exceptions.NoWordsAvailableException;
import lab9.DictionaryTask.DictionaryUtils.Exceptions.EmptyDictionaryException;
import lab9.DictionaryTask.DictionaryUtils.Exceptions.NoWordGivenException;
import lab9.DictionaryTask.DictionaryUtils.Exceptions.NotConvenienceLengthException;
import lab9.DictionaryTask.DictionaryUtils.Exceptions.WordNotFoundException;

import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Dictionary {

    private TreeMap<Character, SortedSet<String>> dictionary;

    public Dictionary() {
        this.dictionary = new TreeMap<>();
    }

    public void addWord(String word) throws NoWordGivenException, NotConvenienceLengthException {

        if (word.isEmpty()) {
            throw new NoWordGivenException("The passed word is empty.");
        }

        if (word.length() < 2) {
            throw new NotConvenienceLengthException("The passed word is less than 2 letters.");
        }

        char firstLetter = word.toLowerCase().charAt(0);
        dictionary.putIfAbsent(firstLetter, new TreeSet<>());
        dictionary.get(firstLetter).add(word.toLowerCase());
    }

    public SortedSet<String> getWordsByLetter(char letter) throws NoWordsAvailableException, EmptyDictionaryException {

        if (dictionary.isEmpty()) {
            throw new EmptyDictionaryException();
        }

        SortedSet<String> words = dictionary.get(letter);

        if (words == null || words.isEmpty()) {
            throw new NoWordsAvailableException("No words found starting with the letter \'" + letter + "\'.");
        }

        return words;
    }

    public void printAllWords() throws EmptyDictionaryException {

        if (dictionary.isEmpty()) {
            throw new EmptyDictionaryException();
        }

        for (Character letter : dictionary.keySet()) {
            System.out.println("Words starting with " + letter + ":");
            for (String word : dictionary.get(letter)) {
                System.out.print("\t" + word + ", ");
            }
        }
    }

    public void removeWord(String word)
            throws WordNotFoundException, NoWordGivenException, NotConvenienceLengthException {
        if (word.isEmpty()) {
            throw new NoWordGivenException("The passed word is empty.");
        }

        if (word.length() < 2) {
            throw new NotConvenienceLengthException("The passed word is less than 2 letters.");
        }

        char firstLetter = word.charAt(0);

        SortedSet<String> words = dictionary.get(firstLetter);

        if (words == null || !words.contains(word)) {
            throw new WordNotFoundException("The word '" + word + "' is not in the dictionary.");
        }

        words.remove(word);

        if (words.isEmpty()) {
            dictionary.remove(firstLetter);
        }
    }
}
