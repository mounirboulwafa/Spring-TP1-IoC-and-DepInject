package dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImp implements IDao {
    @Override
    public double getTemperature() {
        double data = 24;

        return data;
    }
}
