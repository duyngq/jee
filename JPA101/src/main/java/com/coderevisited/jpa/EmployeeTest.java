package com.coderevisited.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {

    private static EntityManager em;

    public static void main( String[] args ) {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "EmployeeService" );
	em = emf.createEntityManager();

	createEmployee( 7, "Saint", "Peter", "Engineering" );
	createEmployee( 8, "Jack", " Dorsey", "Imaginea" );
	createEmployee( 9, "Sam", "Fox", "Imaginea" );

    }

    private static void createEmployee( int id, String firstName, String lastName, String dept ) {
	em.getTransaction().begin();
	Employee emp = new Employee( id, firstName, lastName, dept );
	em.persist( emp );
	em.getTransaction().commit();
    }
}
