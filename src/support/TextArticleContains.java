package support;

import lib.TextArticle;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.TypeSafeMatcher;

public class TextArticleContains extends TypeSafeMatcher<TextArticle> {

    private String expected;

    public TextArticleContains(String expected) {
        this.expected = expected;
    }

    @Override
    public boolean matchesSafely(TextArticle textArticle) {
        return textArticle.text != null && textArticle.text.indexOf(expected) != -1;
    }

    public void describeTo(Description description) {
        description.appendText("An article with text containing: " + expected);
    }

    @Factory
    public static TextArticleContains containsText(String expected) {
        return new TextArticleContains(expected);
    }
}
