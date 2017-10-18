package edu.msud.cs.cs1;

import java.io.File;

public class Pluralizer {
    private int numWords;

    Pluralizer(String word) {
        numWords = 1;
    }

    Pluralizer(File file) {
        // numWords from parsed file
    }

    public String[] pluralize() {
        String[] plurals = new String[numWords];

        return plurals;
    }
}
