package hashmaap;

import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        String inputWord = stringify(word);
        this.dictionary.putIfAbsent(inputWord, new ArrayList<>());
        ArrayList<String> translations = this.dictionary.get(inputWord);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        String searchWord = stringify(word);
        ArrayList<String> listToReturn = this.dictionary.get(searchWord);
        return listToReturn;

    }

    public void remove(String word) {
        String wordToDelete = stringify(word);
        if (this.dictionary.containsKey(wordToDelete)) {
            this.dictionary.remove(wordToDelete);
        } else {
            System.out.println("the word is not present");
        }
    }

    public String stringify(String input) {
        return input.toLowerCase().trim();
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }

}
