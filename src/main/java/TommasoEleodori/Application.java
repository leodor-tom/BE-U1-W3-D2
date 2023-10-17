package TommasoEleodori;


import TommasoEleodori.entities.Evento;
import TommasoEleodori.entities.EventoDAO;
import TommasoEleodori.entities.Tipologia;
import TommasoEleodori.utils.JpaUtil;

import javax.persistence.EntityManager;

import java.util.Date;

import static TommasoEleodori.utils.JpaUtil.emf;

public class Application {
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        Date date = new Date(2026,12,25);
        Date date2 = new Date(2023,10,30);
        try {
            EventoDAO ed = new EventoDAO(em);

            Evento concerto = new Evento("Word Tour", date, "Concerto natalizio", Tipologia.PUBBLICO, 3000);
            Evento concerto2 = new Evento("skr skr", date2, "Concerto natalizio", Tipologia.PUBBLICO, 3000);
            ed.save(concerto);
            ed.save(concerto2);

            Evento concertoById = ed.getById(2);



        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            em.close();
            emf.close();
        }

    }
}
