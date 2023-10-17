package TommasoEleodori.utils;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
        public static final EntityManagerFactory emf;
        static {
            try {
                emf = Persistence.createEntityManagerFactory("BE-U1-W3-D2");
            }catch (Throwable ex){
                    System.err.println("lnitial EntityManagerFactory creation failed." + ex); throw new ExceptionInInitializerError(ex);
                }

        }
        public static EntityManagerFactory getEntityManagerFactory () {
            return emf;
        }
}
