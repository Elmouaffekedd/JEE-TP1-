package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao{


    @Override
    public double getData() {
        System.out.println("Version Base de données");
        double data = 10;
        return data;
    }
}
