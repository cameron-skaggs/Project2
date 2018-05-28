package services;

import java.util.List;

import dao.TrainerDao;
import dao.TrainerDaoImpl;
import hibernate.Trainers;

public class TrainerService {
	private static TrainerDao dao = TrainerDaoImpl.getInstance();
	private TrainerService() {}
	
	public static List<Trainers> getAllTrainers() {
		return dao.getAllTrainers();
	}
}
