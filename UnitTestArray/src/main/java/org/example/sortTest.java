package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class sortTest {

    @Test
    @DisplayName("Array sorted")
    public void sortArray() {
        Main basicTests = new Main();
        int[] array = {5, 8, 3, 9, 1, 6};
        basicTests.sortArray(array);
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 6, 8, 9}, array);
    }
}
