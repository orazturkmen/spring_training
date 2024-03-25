package com.cydeo;

import com.cydeo.config.Config;
import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Oraz");
        comment.setText("Spring Framework");

        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        CommentNotificationProxy commentNotificationProxy = container.getBean(CommentNotificationProxy.class);
        CommentRepository commentRepository = container.getBean(CommentRepository.class);

        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
        System.out.println("*************************************************");

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
