package services;

import java.util.List;

import dao.SkillDao;
import daoimpl.SkillDaoImpl;
import model.Skill;

public class SkillService {

	private static SkillDao dao = SkillDaoImpl.getInstance();
	private SkillService() {}
	
	public static List<Skill> getAllSkills() {
		return dao.getAllSkills();
	}
}
