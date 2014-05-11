import lib.Article;
import lib.TextArticle;
import lib.Journalist;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class JournalistTest {

    Journalist claire;

    @Test
    public void injectNumberInTheArticle() {
        claire = new Journalist();
        Article article = mock(Article.class);
        claire.article = article;
        claire.writeAnArticleAbout(300);

        verify(article).aboutNumber(300);
    }
}

