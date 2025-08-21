package chapone.item5.dependencyinjection.todo;

import chapone.item5.dependencyinjection.EnglishDictionary;

public class CambridgeDictionary extends EnglishDictionary {

    public static CambridgeDictionary create() {
        return new CambridgeDictionary();
    }
}
