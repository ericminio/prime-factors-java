package lib;

public class Journalist {

    public Article article;

    public Journalist() {
        article = new TextArticle();
    }

    public void writeAnArticleAbout(Integer number) {
        article.aboutNumber(number);
    }

    public void willAskGenius(Genius genius) {
    }
}
