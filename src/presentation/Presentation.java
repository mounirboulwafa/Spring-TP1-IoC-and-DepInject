package presentation;

import dao.DaoImp;
import metier.MetierImp;

public class Presentation {
    public static void main(String[] args) {
        DaoImp dao = new DaoImp();
        MetierImp metier = new MetierImp();
        metier.setDao(dao);

        /* Static Injection */

        System.out.println("**** Dependencies Injections (DI) ****");
        System.out.println("Static Injection : ");
        System.out.println(metier.calcul());

    }
}
