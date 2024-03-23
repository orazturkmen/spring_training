package com.cydeo.bean_annotation;


import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        System.out.println("***************Creating Container*****************");
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);
        PC myPc = new PC(theCase, theMonitor, theMotherboard);
        myPc.powerUp();

        AcerMonitor acer = container.getBean(AcerMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard motherboard = container.getBean(AsusMotherboard.class);
        PC myPc2 = new PC(dell,acer,motherboard);
        myPc2.powerUp();

        System.out.println("***************Multiple Objects*****************");
       //Monitor theMonitor2 = container.getBean("monitorSony",Monitor.class); //Default Bean Name
        Monitor theMonitor3 = container.getBean("sony",Monitor.class); //Custom Bean Name
        PC myPc3 = new PC(theCase, theMonitor3, theMotherboard);
        myPc3.powerUp();
    }
}
