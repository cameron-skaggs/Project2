package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();
		List<String> employees = testNg();
		response.getWriter().write(
				mapper.writeValueAsString(employees));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private List<String> testNg() {
		// Get a reference to an XML Suite
		XmlSuite suite = new XmlSuite();
		suite.setName("pomhome");
		
		// Get a reference to an XML Test
		XmlTest test = new XmlTest(suite);
		test.setName("home");
		
		// Set the classes for the XML Test
		List<XmlClass> classes = new ArrayList<>();
		classes.add(new XmlClass("pomtest.HomeTest"));
		test.setXmlClasses(classes);
		
		// Pass the XML Suite to TestNG
		List<XmlSuite> suites = new ArrayList<>();
		suites.add(suite);
		TestNG testng = new TestNG();
		testng.setXmlSuites(suites);
		
		// Run the TestNG Suite
		testng.run();
		return new ArrayList<String>();
	}

}
