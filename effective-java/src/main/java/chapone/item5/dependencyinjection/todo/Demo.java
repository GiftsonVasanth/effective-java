package chapone.item5.dependencyinjection.todo;

public class Demo {

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(new CambridgeDictionary());

        SpellingCheck spellingCheck = new SpellingCheck(CambridgeDictionary::new);

        spellingCheck = new SpellingCheck(CambridgeDictionary::create);
    }
}
