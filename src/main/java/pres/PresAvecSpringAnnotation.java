package pres;

import dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresAvecSpringAnnotation {

    public static void main(String[] args) throws Exception {
        //ApplicationContext context = new AnnotationConfigApplicationContext("ext", "metier");
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
