package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Oraz");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(CydeoApplication.class, args);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

        commentService.printAppData();
    }

}
