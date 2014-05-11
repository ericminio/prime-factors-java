import lib.Article;
import lib.Genius;
import lib.TextArticle;
import lib.Journalist;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        claire.genius = einstein;
        claire.writeAnArticleAbout(300);

        verify(einstein).decompositionOf(300);
    }

    @Test
    public void injectDecompositionInTheArticle() {
        Genius einstein = mock(Genius.class);
        claire.genius = einstein;
        when(einstein.decompositionOf(300)).thenReturn(Arrays.asList(1, 2, 2, 3, 5, 5));
        Article article = mock(Article.class);
        claire.article = article;
        claire.writeAnArticleAbout(300);

        verify(article).withDecomposition(Arrays.asList(1, 2, 2, 3, 5, 5));
    }
}

