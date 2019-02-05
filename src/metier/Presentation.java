package metier;

import dao.DaoImp;

public class Presentation {
    public static void main(String[] args) {
        DaoImp dao = new DaoImp();
        MetierImp metier = new MetierImp();
        metier.setDao(dao);

        System.out.println(metier.calcule());

    }
}
