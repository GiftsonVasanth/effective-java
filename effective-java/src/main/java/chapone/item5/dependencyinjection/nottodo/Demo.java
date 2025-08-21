package chapone.item5.dependencyinjection.nottodo;

import chapone.item5.dependencyinjection.EnglishDictionary;
import chapone.item5.dependencyinjection.todo.SpellChecker;

public class Demo {

    public static void main(String[] args) {
        SpellChecker spellChecker = new chapone.item5.dependencyinjection.todo.SpellChecker(new EnglishDictionary());
    }
}
