package lib;

import katas.primefactors.lib.Mathematician;

public class Journalist {

    public Article article;
    public Genius genius;

    public Journalist() {
        genius = new Mathematician();
        article = new TextArticle();
    }

    public void writeAnArticleAbout(Integer number) {
        article.aboutNumber(number);
        article.withDecomposition(genius.decompositionOf(number));
    }

}
