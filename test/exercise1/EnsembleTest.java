package exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnsembleTest {

    private Ensemble ensemble;

    @BeforeEach
    void setUp() {
        ensemble = new Ensemble(1, 1, 10, 10);
    }

    @Test
    void occurenceTest() {
        assertEquals(ensemble.occurence(1), 1);
        assertEquals(ensemble.occurence(10), 1);

        assertEquals(ensemble.occurence(5), 0);
    }

    @Test
    void unionTest() {
        assertEquals(ensemble.union(new Ensemble(1, 11)), new Ensemble(1, 10, 11));
    }

    @Test
    void intersectionTest() {
        assertEquals(ensemble.intersection(new Ensemble(1, 11)), new Ensemble(1));
        assertEquals(ensemble.intersection(new Ensemble(1, 1, 10, 5)), new Ensemble(1, 10));
    }
}