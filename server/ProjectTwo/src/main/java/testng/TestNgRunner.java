package testng;

import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestNgRunner {    
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
    	manageTest.setName("Manage Test");
    	manageCreateTest.setName("Manage Create Test");
    	manageTraineeTest.setName("Manage Trainee Test");
    	
    	XmlClass homeClass = new XmlClass("testng.HomeTest");
    	XmlClass manageClass = new XmlClass("testng.ManageTest");
    	XmlClass manageCreateClass = new XmlClass("testng.ManageCreateTest");
    	XmlClass manageTraineeViewClass = new XmlClass("testng.ManageTraineeViewTest");
    	
    	List<XmlClass> homeClasses = Arrays.asList( homeClass );
    	List<XmlClass> manageClasses = Arrays.asList( manageClass );
    	List<XmlClass> manageCreateClasses = Arrays.asList( manageCreateClass );
    	List<XmlClass> manageTraineeViewClasses = Arrays.asList( manageTraineeViewClass );
    	
    	homeTest.setXmlClasses(homeClasses);
    	manageTest.setXmlClasses(manageClasses);
    	manageCreateTest.setXmlClasses(manageCreateClasses);
    	manageTraineeTest.setXmlClasses(manageTraineeViewClasses);
    	
    	List<XmlSuite> suites = Arrays.asList( homeSuite, manageSuite, manageCreateSuite, manageTraineeViewSuite );

    	TestNG testng = new TestNG();
    	testng.setXmlSuites(suites);
    	
    	testng.run();   	
    }
}