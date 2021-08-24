package com.pengys.mapper;

import com.pengys.domain.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
author: 悟空非空也（B站/知乎/公众号）
*/
@SpringBootTest
class CommentMapperTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void queryComment() {
        System.out.println("commentMapper.queryComment(1) = " + commentMapper.queryComment(1));
    }

    @Test
    void deleteComment() {
        System.out.println("commentMapper.deleteComment(6) = " + commentMapper.deleteComment(6));
    }

    @Test
    void updateComment(){
        Comment comment = new Comment();
        comment.setId(6);
        comment.setContent("111");
        comment.setAuthor("111");
        System.out.println("commentMapper.updateComment(comment) = " + commentMapper.updateComment(comment));
    }

    @Test
    void insertComment(){
        Comment comment = new Comment();
        comment.setContent("晓庄学生在学习 springboot");
        comment.setAuthor("彭宇晟");
        comment.setArticleId(1);
        System.out.println("commentMapper.insertComment(comment) = " + commentMapper.insertComment(comment));
    }

}