package edu.msud.cs.cs1;

import java.io.File;

public class Pluralizer {
    private int numWords;

    // In contrast from the prototypical version of the assignment
    // the input will only be a word which might or might not be
    // in singlular or plural form. (The original provides an extra
    // input of an integer as a count.
    Pluralizer(String word) {
        numWords = 1;
    }

    Pluralizer(File file) {
        // numWords from parsed file
    }

    // The returned array should contain ONLY plurals.
    public String[] pluralize() {
        String[] plurals = new String[numWords];

        return plurals;
    }
}
