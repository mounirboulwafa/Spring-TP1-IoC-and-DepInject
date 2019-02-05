package metier;

import dao.IDao;

public class MetierImp implements IMetier {

    private IDao dao;

    @Override
    public double calcule() {
        double temp = dao.getTemperature();
        double res = temp * 12;
        return res;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
