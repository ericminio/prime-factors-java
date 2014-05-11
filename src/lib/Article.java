package lib;

public class Article {

    private Integer number;

    public String text;

    public String toString() {
        text = "We've just discovered that " + number + " = 2 x 2 x 3 x 5 x 5!!!";

        return "An article with text = " + text;
    }

    public void aboutNumber(Integer number) {
    }
}
