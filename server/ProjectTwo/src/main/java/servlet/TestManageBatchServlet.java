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

public class TestManageBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestManageBatchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		manageBatchTest();
		response.getWriter().append("TestManageBatchServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
//	
//    private static void manageBatchTest() {
//    	XmlSuite manageSuite = new XmlSuite();    	
//    	XmlTest manageTest = new XmlTest(manageSuite);
//    	XmlClass manageClass = new XmlClass("testng.ManageClass");
//    	List<XmlClass> manageClasses = Arrays.asList( manageClass );    	
//    	List<XmlSuite> suites = Arrays.asList( manageSuite );
//    	TestNG testng = new TestNG();    	
//    	
//    	manageSuite.setName("Manage Suite"); 
//    	manageTest.setName("Manage Test");
//    	manageTest.setXmlClasses(manageClasses);
//    	testng.setXmlSuites(suites);
//    	testng.run();  
//    }

}
