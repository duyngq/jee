package com.accedian.glassfish.movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.accedian.glassfish.movie.model.Movie;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
	Movie movie = new Movie();
	movie.setName( "Terminator" );
	movie.setActors( "ActorMain" );

	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "moviePU" );
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist( movie );
	tx.commit();

	em.close();
	emf.close();
    }
}
