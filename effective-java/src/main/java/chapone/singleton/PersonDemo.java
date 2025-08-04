package chapone.singleton;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = Person.INSTANCE;
        person.setName("some-name")
              .setId("2");

    }
}
