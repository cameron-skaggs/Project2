package services;

import java.util.List;

import dao.LocationDao;
import daoimpl.LocationDaoImpl;
import hibernate.Location;

public class LocationService {

	private static LocationDao dao = LocationDaoImpl.getInstance();
	private LocationService() {}
	
	public static List<Location> getAllLocations() {
		return dao.getAllLocations();
	}
}
