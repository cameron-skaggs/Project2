package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import dao.LocationDao;
import hibernate.HibernateUtil;
import model.Location;

public class LocationDaoImpl implements LocationDao {

	private static LocationDaoImpl instance;
	private LocationDaoImpl() {}
	
	public static LocationDaoImpl getInstance() {
		if (instance == null) {
			instance = new LocationDaoImpl();
		}
		return instance;
	}
	
	@Override
	public List<Location> getAllLocations() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Location", Location.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}
}
