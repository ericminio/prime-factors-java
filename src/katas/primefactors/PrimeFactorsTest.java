package katas.primefactors;

import org.junit.Test;

import static katas.primefactors.support.PrimeFactorsOfANumber.primeFactorsOf;
import static katas.primefactors.support.ListMatcher.are;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {

    @Test
    public void theSpecialCaseOfOne() {
        assertThat(primeFactorsOf(1), are(1));
    }

    @Test
    public void decompositionOfTwo() {
        assertThat(primeFactorsOf(2), are(1, 2));
    }

    @Test
    public void decompositionOfFour() {
        assertThat(primeFactorsOf(4), are(1, 2, 2));
    }

    @Test
    public void decompositionOf300() {
        assertThat(primeFactorsOf(300), are(1, 2, 2, 3, 5, 5));
    }
}
