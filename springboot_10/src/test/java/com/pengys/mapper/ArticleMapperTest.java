package com.pengys.mapper;

import com.pengys.domain.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArticleMapperTest {

    @Autowired
    private  ArticleMapper articleMapper;
    @Test
    void getArticleList(){

        System.out.println(articleMapper.getArticleList());
    }

    @Test
    void getArticleById() {

        System.out.println(articleMapper.getArticleById(1));
    }

    @Test
    void delArticle(){
        System.out.println(articleMapper.delArticle(3));
    }

    @Test
    void addArticle(){
        Article article = new Article();
        article.setTitle("添加添加添加");
        article.setContent("添加");
        System.out.println(articleMapper.addArticle(article));
    }

    @Test
    void updateArticle(){
        Article article = new Article();
        article.setId(2);
        article.setTitle("修改修改修改");
        article.setContent("修改");
        System.out.println(articleMapper.updateArticle(article));
    }


}