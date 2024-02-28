import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translations = dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (dictionary.get(word) == null) {
            return new ArrayList<>();
        }

        return dictionary.get(word);
    }

    public void remove(String word) {
        dictionary.remove(word);
    }

}
