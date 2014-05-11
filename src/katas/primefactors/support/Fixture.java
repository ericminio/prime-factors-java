package katas.primefactors.support;

import katas.primefactors.lib.Mathematician;

import java.util.List;

public class Fixture {

    public static List<Integer> primeFactorsOf(int number) {
        return new Mathematician().decompositionOf(number);
    }

}
