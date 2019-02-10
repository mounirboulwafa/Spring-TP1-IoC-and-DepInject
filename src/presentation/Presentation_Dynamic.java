package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation_Dynamic {

    public static void main(String[] args) {
        try {

            /* Read the Config.txt file */

            Scanner scanner = new Scanner(new File("src/config.txt"));
            String daoClassName = scanner.nextLine();
//            System.out.println(daoClassName);
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
//            System.out.println(dao.getTemperature());

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();


            /* Dynamic Injection */

            Method m = cMetier.getMethod("setDao", IDao.class);
            m.invoke(metier, dao);

            System.out.println("**** Dependencies Injections (DI) ****");
            System.out.println("Dynamic Injection : ");
            System.out.println(metier.calcul());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
