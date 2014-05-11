import lib.Journalist;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static support.ArticleContainsText.containsText;
import static support.ArticleOfJournalist.articleOf;

public class JournalistTest {

    Journalist claire;

    @Test
    public void canWriteAnArticleAbout300()
    {
        claire = new Journalist();
        claire.writeAnArticleAbout(300);

        assertThat(articleOf(claire), containsText("We've just discovered that 300 = 2 x 2 x 3 x 5 x 5!!!"));
    }
}

