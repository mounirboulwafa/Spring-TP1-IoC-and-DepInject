package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class DaoImp_v2 implements IDao {

    @Override
    public double getTemperature() {
        double data = 32;

        return data;
    }
}
