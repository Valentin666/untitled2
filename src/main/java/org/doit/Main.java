package org.doit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

          ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
          MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
          renderer.render();

//        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
//        renderer.render();

//        MessageRenderer renderer = MessageFactory.getRenderer();
//        renderer.render();
    }
}
