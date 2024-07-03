package br.com.senac.atividade3uc10;

import br.com.senac.atividade3uc10.gui.Login;
import br.com.senac.atividade3uc10.persistencia.Podcast;
import br.com.senac.atividade3uc10.persistencia.PodcastDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Atividade3UC10 {

    public static void main(String[] args) {

        Login login = new Login();

        login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);

        
        login.setVisible(true);
        
        //EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Cenaflixatv3-PU");
        //EntityManager manager = fabricaEntidade.createEntityManager();

        //Podcast podcast = new Podcast();
        //podcast.setProdutor("Felipe");
        //podcast.setNomedoepisodio("Lógica De Programação");
        //podcast.setNumeroepisodio(1);
        //podcast.setDuracao("00:30");
        //podcast.setUrl("https://www.exemplo.cenaflix_podcast1.com");
        //manager.getTransaction().begin();
        //manager.persist(podcast);
        //manager.getTransaction().commit();
        //PodcastDAO podcastDao = new PodcastDAO();
        // Podcast p = new Podcast();
        // p.setProdutor("Douglas");
        //p.setNomedoepisodio("JPA");
        //p.setNumeroepisodio(2);
        //p.setDuracao("00:40");
        //p.setUrl("https://www.exemplo.cenaflix_podcast2.com");
        //podcastDao.cadastrar(p);
    }
}
//manager.close ();

//fabricaEntidade.close ();

