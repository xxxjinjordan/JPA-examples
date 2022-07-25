package hellojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{
            Member member = new Member(200L, "Jordan");
            em.persist(member);

            em.flush();
            System.out.println("=====");

//            em.detach(member);
//            em.clear();
            tx.commit();
        } catch(Exception e){
            tx.rollback();
        } finally {
            em.close();
        }
    }
}
