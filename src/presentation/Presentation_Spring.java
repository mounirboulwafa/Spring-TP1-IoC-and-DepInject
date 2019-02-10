package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation_Spring {

    public static void main(String[] args) {
        /* Read the config.xlm file */
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");

        IMetier metier = (IMetier) springContext.getBean("metier");

        System.out.println("**** Dependencies Injections (DI) ****");
        System.out.println("Spring IoC Injection w xml file : ");
        System.out.println(metier.calcule());

    }

}
