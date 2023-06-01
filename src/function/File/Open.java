package function.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Open {
    public static String open() {
        String str = "";
        try {
             str = Files.readString(Paths.get("C:\\Users\\SW2148\\project\\DiDLE\\src\\out\\test.txt"));
        } catch (IOException error) {
            error.printStackTrace();
        }
        return str;
    }

}
