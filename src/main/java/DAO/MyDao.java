package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.Staff;

public class MyDao {
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
 EntityManager em= emf.createEntityManager();
 EntityTransaction et = em.getTransaction();
 
  public void saveStaff(Staff staff){
	  et.begin();
	  em.persist(staff);
	  et.commit();
  }
}
