package com.pengys.repository;

import com.pengys.domain.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    void findAll() {
        List<Comment> commentList = commentRepository.findAll();
        for(Comment comment:commentList){
            System.out.println("comment = " + comment);
        }
    }
    @Test
    void findById() {
        System.out.println(commentRepository.findById(1));
    }

    @Test
    void findByAuthorNotNull(){
        System.out.println(commentRepository.findByAuthorNotNull());
    }


    @Test
    void count() {
        System.out.println("commentRepository.count() = " + commentRepository.count());
    }

    @Test
    void getCommentList(){
        System.out.println(commentRepository.getCommentList(1));
    }

    @Test
    void getCommentList2(){
        System.out.println(commentRepository.getCommentList2(1));
    }


    @Test
    void updateComment(){
        System.out.println(commentRepository.updateComment("6666", 6));
    }

    @Test
    void deleteComment(){
        System.out.println(commentRepository.deleteComment(6));
    }

    @Test
    void save(){
        Comment comment = new Comment();
        comment.setAuthor("wukongnotnull0716");
        comment.setContent("content .... wukong ...");
        System.out.println(commentRepository.save(comment));
    }
}