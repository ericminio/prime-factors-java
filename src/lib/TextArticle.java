package lib;

public class TextArticle implements Article {

    public String text;

    public String toString() {
        return "An article with text = " + text;
    }

    @Override
    public void aboutNumber(Integer number) {
        text = "We've just discovered that " + number + " = 2 x 2 x 3 x 5 x 5!!!";
    }
}
