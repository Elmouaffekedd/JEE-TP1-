package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {

    public static void main(String[] args) {
        // Instanciation statique:
        //DaoImpl dao=new DaoImpl();


        // Instanciation statique:
        //MetierImpl metier=new MetierImpl();

        // Instanciation statique + Injection via constructeur:
        //MetierImpl metier=new MetierImpl(dao);


        // Injection des dependances Statique:
        //metier.setDao(dao);


        //System.out.println(metier.calcul());
    }
}
