package pl.akademiakodu.articleApp.dao;

import pl.akademiakodu.articleApp.model.Article;

import java.util.List;

public interface ArticleDAO {

    List<Article> get AllArticles();
    Article getArticleById(int articleId);

}
