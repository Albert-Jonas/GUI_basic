package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CopyFilesTest {
    CopyFiles copyFiles = null;
    File file = null;

    @TempDir
    Path tempDir;
    private com.example.gui_basic.CopyFiles CopyFiles;

    @BeforeEach
    void setUp() {
        CopyFiles = new CopyFiles();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testWrite () throws IOException {

        final Path tempFile = Files.createFile(tempDir.resolve("myfile.txt"));
        Files.writeString(tempFile, "Fekete puli kutya");
        final String s = Files.readString(tempFile);


    }


    @Test
    void main() {
    }
}