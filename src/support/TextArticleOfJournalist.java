package support;

import lib.TextArticle;
import lib.Journalist;

public class TextArticleOfJournalist {

    public static TextArticle articleOf(Journalist journalist) {
        return (TextArticle) journalist.article;
    }
}
