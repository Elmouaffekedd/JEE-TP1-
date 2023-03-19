package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws Exception {
        // Instanciation statique :
        // DaoImpl dao=new DaoImpl();

        // Instanciation dynamique :
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.getConstructor().newInstance();// Avec souscasting car on lui affecte un objet de la classe DaoImpl ( ce n'est pas un nouvelle instanciation : new)

        ////////////////////////////////////////

        // Instanciation statique :
        // MetierImpl metier=new MetierImpl();

        // Instanciation dynamique :
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        //IMetier metier= (IMetier) cMetier.getConstructor().newInstance();// Avec souscasting car on lui affecte un objet de la classe MetierImpl ( ce n'est pas une nouvelle instanciation : new) sans consructeur.
        IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);// Avec souscasting car on lui affecte un objet de la classe MetierImpl ( ce n'est pas une nouvelle instanciation : new) avec consructeur.

        /////////////////////////////////////////////////////

        // Injection des dependances statique :
        // metier.setDao(dao);

        // // Injection des dépendances dynamique :
        Method setDao=cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // Injection des dépendances dynamique.


        System.out.println(metier.calcul());







    }
}
