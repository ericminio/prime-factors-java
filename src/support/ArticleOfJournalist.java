package support;

import lib.Article;
import lib.Journalist;

public class ArticleOfJournalist {

    public static Article articleOf(Journalist journalist) {
        return journalist.article;
    }
}
