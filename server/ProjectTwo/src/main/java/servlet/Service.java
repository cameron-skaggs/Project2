package servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.fasterxml.jackson.databind.ObjectMapper;

import testng.TestListener;
import testng.TestResult;

public class Service {
	public static void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestResult testResult = test("home");		
		
		response.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();
		response.getWriter().write(
				mapper.writeValueAsString(testResult));	
	}
	
	public static void manageBatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestResult testResult = test("manage");
		
		response.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();
		response.getWriter().write(
				mapper.writeValueAsString(testResult));		
	}
	
	public static void assessBatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("TestAssessBatchServlet");
	}
	
	public static void reports(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("TestReportsServlet");
	}
	
	public static void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
    public static TestResult test(String name) {
    	String className = "";
    	String suiteName = "";
    	String testName = "";
    	
    	switch(name) {
    	case "manage":
    		className = "testng.ManageClass";
    		suiteName = "Manage Suite";
    		testName = "Manage Test";
    		break;
    	case "home":
    		className = "testng.HomeClass";
    		suiteName = "Home Suite";
    		testName = "Home Test";
    		break;
    	case "reports":
    		className = "testng.ReportsClass";
    		suiteName = "Reports Suite";
    		testName = "Reports Test";
    	case "assess":
    		className = "testng.AssessBatchClass";
    		suiteName = "Assess Batch Suite";
    		testName = "Assess Batch Test";
    	}
    	
    	XmlSuite manageSuite = new XmlSuite();
    	XmlTest manageTest = new XmlTest(manageSuite);
    	XmlClass manageClass = new XmlClass(className);
    	List<XmlClass> manageClasses = Arrays.asList( manageClass );
    	List<XmlSuite> suites = Arrays.asList( manageSuite );
    	TestNG testng = new TestNG();
    	TestListener testListener = new TestListener();
    	
    	manageSuite.setName(suiteName);
    	manageTest.setName(testName);
    	manageTest.setXmlClasses(manageClasses);
    	testng.setXmlSuites(suites);
    	testng.addListener(testListener);
    	
    	testng.run();
    	return testListener.getTestResult();
    }
}
