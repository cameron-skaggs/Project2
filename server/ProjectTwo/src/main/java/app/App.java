package app;

import org.hibernate.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;
import model.Skill;

public class App {

	public static void main(String[] args) {
		Skill s = new Skill("Test2");
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			t = session.beginTransaction();
			session.save(s);
			t.commit();
			System.out.println("Successfully inserted");
		}  catch (HibernateException hbe) {
			HibernateUtil.rollbackTransaction(t);
			hbe.printStackTrace();
			System.out.println("Failed to insert");
		} finally {
			HibernateUtil.shutdownSession(session);
			System.out.println("COMPLETED!");
		}
		
	}
	

}
