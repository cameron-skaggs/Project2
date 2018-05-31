package daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import dao.SkillDao;
import hibernate.HibernateUtil;
import hibernate.Skill;

public class SkillDaoImpl implements SkillDao {

	private static SkillDaoImpl instance;
	private SkillDaoImpl() {}
	
	public static SkillDaoImpl getInstance() {
		if (instance == null) {
			instance = new SkillDaoImpl();
		}
		return instance;
	}
	@Override
	public List<Skill> getAllSkills() {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			return session.createQuery("from Skill", Skill.class).getResultList();
		} catch (HibernateException hbe) {
			hbe.printStackTrace();
		} finally {
			HibernateUtil.shutdownSession(session);
		}
		return null;
	}

}
