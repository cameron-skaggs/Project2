package services;

import java.util.List;

import dao.SkillDao;
import dao.SkillDaoImpl;
import hibernate.Skill;

public class SkillService {

	private static SkillDao dao = SkillDaoImpl.getInstance();
	private SkillService() {}
	
	public static List<Skill> getAllSkills() {
		return dao.getAllSkills();
	}
}
