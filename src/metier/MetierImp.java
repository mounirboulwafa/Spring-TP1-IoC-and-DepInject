package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImp implements IMetier {

    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
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
