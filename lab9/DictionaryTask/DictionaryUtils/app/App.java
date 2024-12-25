package lab9.DictionaryTask.DictionaryUtils.app;

import lab9.DictionaryTask.DictionaryUtils.Dictionary.Dictionary;
import lab9.DictionaryTask.DictionaryUtils.Exceptions.*;

import java.util.Scanner;

import lab7.StringReference.stringUtils.Validator;

public class App {

    public static void start() {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                printMenu();
                String inputChoice = scanner.nextLine();

                if (isValidChoice(inputChoice)) {
                    int choice = Integer.parseInt(inputChoice);
                    switch (choice) {
                        case 1:
                            handleAddWord(scanner, dictionary);
                            break;
                        case 2:
                            handleGetWordsByLetter(scanner, dictionary);
                            break;
                        case 3:
                            handlePrintAllWords(dictionary);
                            break;
                        case 4:
                            handleRemoveWord(scanner, dictionary);
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Invalid Choice. try again.");
                    }
                } else {
                    System.out.println("Invalid Choice. Please enter a number between 1 and 5.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nEnter a command:");
        System.out.println("1: Add a word");
        System.out.println("2: Get words by letter");
        System.out.println("3: Print all words");
        System.out.println("4: Remove a word");
        System.out.println("5: Exit");
    }

    private static boolean isValidChoice(String input) {
        return input.matches("[1-5]");
    }

    private static void handleAddWord(Scanner scanner, Dictionary dictionary) {
        System.out.print("Enter word to add: ");
        String word = scanner.nextLine();
        if (!Validator.isAlphbetOnly(word, Character::isLetter)) {
            System.out.println("Only Alphabets allowed");
            return;
        }

        try {

            dictionary.addWord(word);
            System.out.println("Word " + word + " added!");
        } catch (NoWordGivenException | NotConvenienceLengthException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static void handleGetWordsByLetter(Scanner scanner, Dictionary dictionary) {
        System.out.print("Enter letter to get words for: ");
        Character letter = scanner.nextLine().charAt(0);

        if (!Validator.isAlphbetOnly(letter.toString(), Character::isLetter)) {
            System.out.println("Only Alphabets Allowed");
            return;
        }

        try {
            System.out.println("Words starting with '" + letter + "':");
            dictionary.getWordsByLetter(letter).forEach(System.out::println);
        } catch (NoWordsAvailableException | EmptyDictionaryException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handlePrintAllWords(Dictionary dictionary) {
        try {
            dictionary.printAllWords();
        } catch (EmptyDictionaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleRemoveWord(Scanner scanner, Dictionary dictionary) {
        System.out.print("Enter word to remove: ");
        String wordToRemove = scanner.nextLine();

        if (!Validator.isAlphbetOnly(wordToRemove, Character::isLetter)) {
            System.out.println("Only Alphabets allowed");
            return;
        }

        try {
            dictionary.removeWord(wordToRemove);
            System.out.println("Word " + wordToRemove + " removed!");
        } catch (WordNotFoundException | NotConvenienceLengthException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
