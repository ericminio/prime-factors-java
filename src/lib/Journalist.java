package lib;

public class Journalist {

    public Article article;

    public Journalist() {
        article = new Article();
    }

    public void writeAnArticleAbout(Integer number) {
        article.aboutNumber(number);
    }
}
