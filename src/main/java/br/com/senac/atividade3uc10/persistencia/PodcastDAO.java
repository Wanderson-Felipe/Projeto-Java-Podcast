package br.com.senac.atividade3uc10.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class PodcastDAO {

    public void cadastrar(Podcast p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Podcast p = em.find(Podcast.class, id);
            if (p != null) {
                em.getTransaction().begin();
                em.remove(p);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public List<Podcast> listarTodosPodcasts() {
        EntityManager em = JPAUtil.getEntityManager();
        TypedQuery<Podcast> query = em.createQuery("SELECT p FROM Podcast p", Podcast.class);
        List<Podcast> podcasts = query.getResultList();
        em.close();
        return podcasts;
    }

}
