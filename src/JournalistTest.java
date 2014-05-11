import lib.Article;
import lib.Journalist;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static support.ArticleContainsText.containsText;
import static support.ArticleOfJournalist.articleOf;

public class JournalistTest {

    Journalist claire;

    @Test
    public void injectNumberInTheArticle() {
        Article article = mock(Article.class);
        claire = new Journalist();
        claire.article = article;
        claire.writeAnArticleAbout(300);

        verify(article).aboutNumber(300);
    }
}

