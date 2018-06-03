package app;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtil;
import model.Skill;

public class App {

//	public static void main(String[] args) {
//		Properties props = new Properties();
//		Configuration cfg = new Configuration();
//		try {
//			// Load our hibernate.properties file
//			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));
//			
//			// Set the properties to the Configuration
//			System.out.println("URL " + props.getProperty("hibernate.connection.url"));
//			System.out.println("User Name " + props.getProperty("hibernate.connection.username"));
//			cfg.setProperties(props);
//		} catch (FileNotFoundException fnfe) {
//			fnfe.printStackTrace();
//		} catch (IOException ioe) {
//			ioe.printStackTrace();
//		}
//		SessionFactory sf = cfg.configure().buildSessionFactory();
//		Session s = sf.openSession();
//		s.close();
//	}
	
	
	public static void main(String[] args) {
		Skill s = new Skill("Test2");
		Session session = null;
		Transaction t = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Session is " + session);
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
