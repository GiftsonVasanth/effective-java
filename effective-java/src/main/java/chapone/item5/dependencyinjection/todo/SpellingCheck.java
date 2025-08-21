package chapone.item5.dependencyinjection.todo;

import java.util.function.Supplier;

import chapone.item5.dependencyinjection.Dictionary;
import chapone.item5.dependencyinjection.EnglishDictionary;

public class SpellingCheck {

    private Dictionary dictionary;

    // you can also pass factories to the constructor
    public SpellingCheck(Supplier<? extends EnglishDictionary> dictionary) {
        this.dictionary = dictionary.get();
    }
}
