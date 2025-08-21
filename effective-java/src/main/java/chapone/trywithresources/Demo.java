package chapone.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws Exception {

        String path = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            br.readLine();
        } finally {
            br.close();
            // if the underlying resource is not accessible, the exception is thrown in try block,
            // and then finally block is executed, and consequently exception is thrown in the finally
            // block, suppressing the original exception thrown.
        }

        // also the above code is a little convoluted.

        // try-with-resources comes for rescue.

        try (BufferedReader br2 = new BufferedReader(new FileReader(path))) {
            br2.readLine();
        }
        // 1. code is simple
        // 2. correct exception is thrown.
    }
}
