package services;

import java.util.List;

import dao.TrainingTypeDao;
import daoimpl.TrainingTypeDaoImpl;
import hibernate.TrainingType;

public class TrainingTypeService {
	private static TrainingTypeDao dao = TrainingTypeDaoImpl.getInstance();
	private TrainingTypeService() {}
	
	public static List<TrainingType> getAllTrainers() {
		return dao.getAllTrainingTypes();
	}
}
