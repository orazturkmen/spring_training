package com.cydeo;

import com.cydeo.casefactory.Case;
import com.cydeo.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PcTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Case theCase = container.getBean(Case.class);

        System.out.println(theCase.getDimensions().getDepth());
        System.out.println(theCase.getDimensions().getHeight());
        System.out.println(theCase.getDimensions().getWidth());

    }
}
