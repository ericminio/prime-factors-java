package lib;

import java.util.List;

public class TextArticle implements Article {

    public String text;
    private String decomposition;

    public String toString() {
        return "An article with text = " + text;
    }

    @Override
    public void aboutNumber(Integer number) {
        text = "We've just discovered that " + number + " = " + decomposition + "!!!";
    }

    @Override
    public void withDecomposition(List<Integer> primeFactors) {

    }
}
