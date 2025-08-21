package chapone.item5.dependencyinjection.todo;

import chapone.item5.dependencyinjection.Dictionary;

public class SpellChecker {
    private Dictionary dictionary;

    // inject the dependency through the constructor
    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
}
