package ProjectA;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MusicTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    public void testAddSong() {
        provideInput("1\nTest Song\nTest Artist\n100\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("Song added successfully!"));
    }

    @Test
    public void testRemoveSong() {
        provideInput("2\nSong A\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("Song removed successfully."));

        provideInput("2\nNonexistent Song\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("Song not found."));
    }

    @Test
    public void testPrintAllSongs() {
        provideInput("3\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("Song A"));
        assertTrue(getOutput().contains("Song J"));
    }

    @Test
    public void testPrintSongsAbovePlayCount() {
        provideInput("4\n100000\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("Song C"));
        assertTrue(getOutput().contains("Song E"));
        assertTrue(getOutput().contains("Song H"));

        provideInput("4\n1000000\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("No songs found with more than 1000000 plays."));
    }

    @Test
    public void testInvalidChoice() {
        provideInput("6\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("Invalid choice. Please try again."));
    }

    @Test
    public void testExitApplication() {
        provideInput("5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("Exiting application."));
    }

    @Test
    public void testEmptySongList() {
        provideInput("2\nSong A\n2\nSong B\n2\nSong C\n2\nSong D\n2\nSong E\n2\nSong F\n2\nSong G\n2\nSong H\n2\nSong I\n2\nSong J\n3\n5\n");
        Music.MusicStreamingApp.main(new String[]{});
        assertTrue(getOutput().contains("No songs available."));
    }
}