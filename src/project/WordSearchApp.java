package project;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WordSearchApp {
    public static void main(String[] args) {

        // I need to get a bunch of words that I need to put into this grid
        List<String> words = Arrays.asList("ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT");
        Grid grid = new Grid(12);
        grid.fillGrid(words);
        grid.displayGrid();


    }
}