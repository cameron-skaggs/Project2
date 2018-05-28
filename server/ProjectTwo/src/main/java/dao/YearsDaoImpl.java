package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;
import hibernate.Years;

public class YearsDaoImpl implements YearsDao {

	private static YearsDaoImpl instance;
	private YearsDaoImpl() {}
	
	public static YearsDaoImpl getInstance() {
		if (instance == null) {
			instance = new YearsDaoImpl();
		}
		return instance;
	}
	@Override
	public List<Years> getAllYears() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Years", Years.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}

}
