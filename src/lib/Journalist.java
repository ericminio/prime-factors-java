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
        genius.decompositionOf(number);
        article.aboutNumber(number);
    }

}
