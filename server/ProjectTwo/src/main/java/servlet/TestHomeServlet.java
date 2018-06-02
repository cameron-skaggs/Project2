package servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestHomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		homeTest();
		response.getWriter().append("TestHomeServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void homeTest() {
		XmlSuite homeSuite = new XmlSuite();
		XmlTest homeTest = new XmlTest(homeSuite);
		XmlClass homeClass = new XmlClass("testng.HomeClass");
		List<XmlClass> homeClasses = Arrays.asList(homeClass);
		List<XmlSuite> homeSuites = Arrays.asList(homeSuite);
		TestNG testng = new TestNG();

		homeSuite.setName("Home Suite");
		homeTest.setName("Home Test");
		homeTest.setXmlClasses(homeClasses);
		testng.setXmlSuites(homeSuites);
		testng.run();	
	}
}
