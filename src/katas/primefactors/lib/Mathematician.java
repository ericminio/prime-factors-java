package katas.primefactors.lib;

import lib.Genius;

import java.util.ArrayList;
import java.util.List;

public class Mathematician implements Genius {

    @Override
    public List<Integer> decompositionOf(Integer number) {
        List<Integer> factors = new ArrayList<Integer>();
        int factor = 1;
        factors.add(factor);
        while (number > 1) {
            factor ++;
            while(number % factor == 0) {
                factors.add(factor);
                number /= factor;
            }
        }
        return factors;
    }
}
