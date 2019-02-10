package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation_SpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext springContext = new AnnotationConfigApplicationContext("dao", "metier");

//        chercher un bean inmplimentont l'iterface IMetier'
        IMetier metier = springContext.getBean(IMetier.class);

        System.out.println("**** Dependencies Injections (DI) ****");
        System.out.println("Spring IoC Injection using Annotations : ");
        System.out.println(metier.calcul());

    }
}
