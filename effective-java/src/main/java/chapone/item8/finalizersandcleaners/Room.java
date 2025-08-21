package chapone.item8.finalizersandcleaners;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    // Resources that require cleaning. Must not refer to the room!
    private static class State implements Runnable {

        int numJunkies;

        State(int numJunkies) {
            this.numJunkies = numJunkies;
        }

        // invoked by close method or cleaner
        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkies = 0;
        }
    }

    // state that is shared by the cleaner
    private final State state;

    private final Cleaner.Cleanable cleanable; // to clean the room

    public Room(int numJunkies) {
        this.state = new State(numJunkies);
        // register the cleaner with the room
        this.cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean(); // invoke the cleaner
    }
}
