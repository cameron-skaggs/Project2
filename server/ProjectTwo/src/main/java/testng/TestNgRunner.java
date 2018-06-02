package testng;

import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestNgRunner {    
    public static void main(String[] args) {
    	homeTest();
    	manageBatchTest();
    }
    
    private static void homeTest() {
    	XmlSuite homeSuite = new XmlSuite();
    	XmlTest homeTest = new XmlTest(homeSuite);
    	XmlClass homeClass = new XmlClass("testng.HomeClass");
    	List<XmlClass> homeClasses = Arrays.asList( homeClass );
    	List<XmlSuite> homeSuites = Arrays.asList( homeSuite );
    	TestNG testng = new TestNG();
    	
    	homeSuite.setName("Home Suite");    	
       	homeTest.setName("Home Test");
       	homeTest.setXmlClasses(homeClasses);
       	testng.setXmlSuites(homeSuites);
       	testng.run();
    }
    
    private static void manageBatchTest() {
    	XmlSuite manageSuite = new XmlSuite();    	
    	XmlTest manageTest = new XmlTest(manageSuite);
    	XmlClass manageClass = new XmlClass("testng.ManageClass");
    	List<XmlClass> manageClasses = Arrays.asList( manageClass );    	
    	List<XmlSuite> suites = Arrays.asList( manageSuite );
    	TestNG testng = new TestNG();    	
    	
    	manageSuite.setName("Manage Suite"); 
    	manageTest.setName("Manage Test");
    	manageTest.setXmlClasses(manageClasses);
    	testng.setXmlSuites(suites);
    	testng.run();  
    }
    
    private void assessBatchTest() {
    }
    
    private void reportsTest() {
    }
}