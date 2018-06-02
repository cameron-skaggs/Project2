package daoimpltest;
import java.util.List;

import daoimpl.LocationDaoImpl;
import junit.framework.TestCase;
import model.Location;

public class LocationDaoImplTest extends TestCase {
	LocationDaoImpl dao;
	protected void setUp() throws Exception {
		super.setUp();
		dao = LocationDaoImpl.getInstance();
	}

	public void testGetAllLocations() {
//		List<Location> locations = dao.getAllLocations();
//		System.out.println(locations);
	}

}
