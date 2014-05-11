package katas.primefactors.lib;

import java.util.ArrayList;
import java.util.List;

public class Mathematician {

    public List<Integer> decompositionOf(int number) {
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
