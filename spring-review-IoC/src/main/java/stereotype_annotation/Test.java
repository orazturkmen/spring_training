package stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotation.config.Config;
import stereotype_annotation.model.DataStructure;
import stereotype_annotation.model.Microservice;

public class Test {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        Microservice microservice = container.getBean(Microservice.class);

        dataStructure.getTotalHours();
        microservice.getTotalHours();
    }
}
