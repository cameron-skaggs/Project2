package testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestNgRunner {
//    public static void main(String[] args) {
//        // Get a reference to an XML Suite
//        XmlSuite suite = new XmlSuite();
//        suite.setName("Home Suite");
//        
//        // Get a reference to an XML Test
//        XmlTest test = new XmlTest(suite);
//        test.setName("Hello World Test");
//        
//        // Set the classes for the XML Test
//        List<XmlClass> classes = new ArrayList<>();
//        classes.add( new XmlClass("testng.HomeTest") );
//        classes.add( new XmlClass("testng.ManageTest") );
//        classes.add( new XmlClass("testng.ManageCreateTest") );
//        classes.add( new XmlClass("testng.ManageTraineeViewTest") );
//        test.setXmlClasses(classes);
//        
//        // Pass the XML Suite to TestNG
//        List<XmlSuite> suites = new ArrayList<>();
//        suites.add(suite);
//        TestNG testng = new TestNG();
//        testng.setXmlSuites(suites);
//        
//        // Run the TestNG Suite
//        testng.run();
//    }
    
    public static void main(String[] args) {
    	XmlSuite homeSuite = new XmlSuite();
    	XmlSuite manageSuite = new XmlSuite();
    	XmlSuite manageCreateSuite = new XmlSuite();
    	XmlSuite manageTraineeViewSuite = new XmlSuite();
    	
    	homeSuite.setName("Home Suite");
    	manageSuite.setName("Manage Suite");
    	manageCreateSuite.setName("Manage Create Suite");
    	manageTraineeViewSuite.setName("Manage Trainee View Suite");
    	
    	XmlTest homeTest = new XmlTest(homeSuite);
    	XmlTest manageTest = new XmlTest(manageSuite);
    	XmlTest manageCreateTest = new XmlTest(manageCreateSuite);
    	XmlTest manageTraineeTest = new XmlTest(manageTraineeViewSuite);
    	
    	homeTest.setName("Home Test");
    	
    	
    	XmlClass HomeClass = new XmlClass("testng.HomeTest");
    	XmlClass ManageClass = new XmlClass("testng.ManageTest");
    	XmlClass ManageCreateClass = new XmlClass("testng.ManageCreateTest");
    	XmlClass ManageTraineeView = new XmlClass("testng.ManageTraineeViewTest");
    	

    	
    	 
    	
    }
}