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

import com.fasterxml.jackson.databind.ObjectMapper;

import listener.TestListener;
import listener.TestResult;

public class TestManageBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestManageBatchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestResult testResult = Util.test("manage");
		
		response.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();
		response.getWriter().write(
				mapper.writeValueAsString(testResult));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
