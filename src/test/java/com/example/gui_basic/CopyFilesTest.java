import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.example.gui_basic.CopyFiles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class CopyFilesTest {

    CopyFiles CopyFiles = null;

    @BeforeEach
    void setUp() {
        CopyFiles = new CopyFiles();
    }

    @TempDir
    Path tempDir;

    @Test
    @DisplayName("copyContent teszt Temp diractory-ban létrehozott fájllal")
    void copyContent_tempDir() throws Exception {
        // Create a temporary file. This is guaranteed to be deleted after the test finishes.
        final Path tempFileA = Files.createFile(tempDir.resolve("tempFileA.txt"));
        final Path tempFileB = Files.createFile(tempDir.resolve("tempFileB.txt"));

        // Egyik fájlba a tesztszöveteg írjuk, ezt másoljuk majd át a másikba
        Files.writeString(tempFileA, "Hello World");

        // Meghívjuk a CopyFiles metódust
        CopyFiles.copyContent(new File(tempFileA.toString()), new File(tempFileB.toString()));

        // Visszaolvassuk a másik (CopyFiles metódussal másolt) fájl tartalmát
        final String s = Files.readString(tempFileB);

        // Ellenőrizzük, hogy egyezik-e az első fájlba írt tartalommal
        assertThat("Hello World", is(s));
    }

    @Test
    @DisplayName("copyContent teszt saját fájllal")
    void copyContent_fixFile() throws Exception {
        // 2 tesztfájl, testFileA.txt tartalma: "proba"
        File testFileA = new File("C:\\Users\\Zsófi\\IdeaProjects\\GUI_basic\\src\\main\\resources\\testFileA.txt");
        File testFileB = new File("C:\\Users\\Zsófi\\IdeaProjects\\GUI_basic\\src\\main\\resources\\testFileB.txt");

        // testFileB.txt tartalmát töröljük
        Files.writeString(testFileB.toPath(), "");

        // Meghívjuk a CopyFiles metódust
        CopyFiles.copyContent(testFileA, testFileB);

        // Visszaolvassuk testFileB.txt  tartalmát
        final String s = Files.readString(Paths.get("C:\\Users\\Zsófi\\IdeaProjects\\GUI_basic\\src\\main\\resources\\testFileB.txt"));

        // Ellenőrizzük, hogy egyezik-e az első fájlba írt tartalommal
        assertThat("proba", is(s));
    }
}