import lib.Article;
import lib.Genius;
import lib.TextArticle;
import lib.Journalist;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class JournalistTest {

    Journalist claire;

    @Before
    public void aJournalist() {
        claire = new Journalist();
    }

    @Test
    public void injectNumberInTheArticle() {
        Article article = mock(Article.class);
        claire.article = article;
        claire.writeAnArticleAbout(300);

        verify(article).aboutNumber(300);
    }

    @Test
    public void askAGeniusToDecomposeTheGivenNumber() {
        Genius einstein = mock(Genius.class);
        claire.willAskGenius(einstein);
        claire.writeAnArticleAbout(300);

        verify(einstein).decompositionOf(300);
    }
}

