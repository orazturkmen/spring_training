package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PcTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);
        PC myPc = container.getBean(PC.class);

        myPc.powerUp();
        System.out.println("The Case Depth: " + myPc.getTheCase().getDimensions().getDepth());
        myPc.getMonitor().drawPixelAt();
    }
}
