package function.File;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Save {
    public static void save(String text) {
        try {
            Path path = Paths.get("C:\\Users\\SW2148\\project\\DiDLE\\src\\out\\test.txt");
            Files.write(path, text.getBytes());
        } catch(Exception error) {
            error.printStackTrace();
        }
    }
}
