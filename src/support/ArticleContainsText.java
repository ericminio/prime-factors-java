package support;

import lib.Article;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.TypeSafeMatcher;

public class ArticleContainsText extends TypeSafeMatcher<Article> {

    private String expected;

    public ArticleContainsText(String expected) {
        this.expected = expected;
    }

    @Override
    public boolean matchesSafely(Article article) {
        return article.text != null && article.text.indexOf(expected) != -1;
    }

    public void describeTo(Description description) {
        description.appendText("An article with text containing: " + expected);
    }

    @Factory
    public static ArticleContainsText containsText(String expected) {
        return new ArticleContainsText(expected);
    }
}
