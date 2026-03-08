package learn.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SorterTest {
    @Test
    void standardPackage() {
        assertEquals("STANDARD", Sorter.sort(10, 10, 10, 1));
    }

    @Test
    void bulkyByVolumeIsSpecial() {
        assertEquals("SPECIAL", Sorter.sort(100, 100, 100, 1));
    }

    @Test
    void heavyIsSpecial() {
        assertEquals("SPECIAL", Sorter.sort(10, 10, 10, 20));
    }

    @Test
    void bulkyAndHeavyIsRejected_byDimension() {
        assertEquals("REJECTED", Sorter.sort(150, 10, 10, 20));
    }

    @Test
    void bulkyAndHeavyIsRejected_byVolume() {
        assertEquals("REJECTED", Sorter.sort(100, 100, 100, 20));
    }
}
