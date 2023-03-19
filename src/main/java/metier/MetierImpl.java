package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{

    //@Autowired // Injection dependances --> à evtier en utilisant un constructeur.
    private IDao dao; // Couplage faible --> Polymorphisme

    // Constructeur:
    public MetierImpl(IDao dao){
        this.dao=dao;
    }



    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*11.4;
        return res;
    }

    // Pour permettre d'injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
