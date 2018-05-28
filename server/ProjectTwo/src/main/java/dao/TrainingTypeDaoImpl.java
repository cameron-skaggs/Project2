package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import hibernate.HibernateUtil;
import hibernate.TrainingType;

public class TrainingTypeDaoImpl implements TrainingTypeDao {
	private static TrainingTypeDaoImpl instance;
	private TrainingTypeDaoImpl() {}
	
	public static TrainingTypeDaoImpl getInstance() {
		if (instance == null) {
			instance = new TrainingTypeDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<TrainingType> getAllTrainingTypes() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from TrainingType", TrainingType.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}
}
