package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import dao.TrainerDao;
import hibernate.HibernateUtil;
import hibernate.Trainers;

public class TrainerDaoImpl implements TrainerDao {
	private static TrainerDaoImpl instance;
	private TrainerDaoImpl() {}
	
	public static TrainerDaoImpl getInstance() {
		if (instance == null) {
			instance = new TrainerDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<Trainers> getAllTrainers() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Location", Trainers.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
		
	}
}
