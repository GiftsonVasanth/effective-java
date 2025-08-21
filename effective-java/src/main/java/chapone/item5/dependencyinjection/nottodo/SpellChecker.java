package chapone.item5.dependencyinjection.nottodo;

import chapone.item5.dependencyinjection.Dictionary;
import chapone.item5.dependencyinjection.EnglishDictionary;

public class SpellChecker {

    // don't initialize resource like this as it may change.
    // what if you wanted to use a different dictionary?
    private static final Dictionary dictionary = new EnglishDictionary();
}
