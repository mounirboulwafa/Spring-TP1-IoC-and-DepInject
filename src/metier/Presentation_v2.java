package metier;

import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation_v2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/config.txt"));
            String daoClassName = scanner.nextLine();
//            System.out.println(daoClassName);
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.newInstance();
//            System.out.println(dao.getTemperature());

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.newInstance();

            Method m = cMetier.getMethod("setDao", IDao.class);
            m.invoke(metier, dao);
            
            System.out.println(metier.calcule());


        } catch (FileNotFoundException | ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
