package katas.primefactors.support;

import org.hamcrest.Matcher;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

public class ListMatcher {

    public static Matcher<? super List<Integer>> are(Integer... factors) {
        List<Integer> expected = new ArrayList<Integer>();
        for (Integer factor: factors) {
            expected.add(factor);
        }
        return equalTo(expected);
    }

}
