package lib;

import java.util.List;
import java.util.stream.Collectors;

public class TextArticle implements Article {

    public String text;
    private String decomposition;
    private Integer number;

    public String toString() {
        return "An article with text = " + text;
    }

    @Override
    public void aboutNumber(Integer number) {
        this.number = number;
        buildText();
    }

    @Override
    public void withDecomposition(List<Integer> primeFactors) {
        decomposition = primeFactors.stream().filter(p -> p != 1)
                                    .map(p -> p.toString()).collect(Collectors.joining(" x "));
        buildText();
    }

    private void buildText() {
        text = "We've just discovered that " + number + " = " + decomposition + "!!!";
    }
}
