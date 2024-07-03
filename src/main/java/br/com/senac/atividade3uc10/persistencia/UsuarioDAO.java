package br.com.senac.atividade3uc10.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

public class UsuarioDAO {

    private EntityManager entityManager;

    public UsuarioDAO() {
        this.entityManager = JPAUtil.getEntityManager();
    }

    public boolean autenticar(String usuario, String senha) {

        return false;

    }

    public Usuario buscarPorLogin(String login) {
        try {
            entityManager.getTransaction().begin();

            
            Query query = entityManager.createQuery("SELECT u FROM Usuario u WHERE u.login = :login", Usuario.class);
            query.setParameter("login", login);
            Usuario usuario = (Usuario) query.getSingleResult();

            entityManager.getTransaction().commit();

            return usuario;
        } catch (NoResultException e) {
            return null; 
        } finally {
            entityManager.close();
        }
    }

}
