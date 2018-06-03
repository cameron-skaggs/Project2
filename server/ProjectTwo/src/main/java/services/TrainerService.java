package services;

import java.util.List;

import dao.TrainerDao;
import daoimpl.TrainerDaoImpl;
import model.Trainers;

public class TrainerService {
	private static TrainerDao dao = TrainerDaoImpl.getInstance();
	private TrainerService() {}
	
	public static List<Trainers> getAllTrainers() {
		return dao.getAllTrainers();
	}
}
