package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import listener.TestResult;

public class TestHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestHomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestResult testResult = Util.test("home");		
		
		response.setContentType("application/json");
		
		ObjectMapper mapper = new ObjectMapper();
		response.getWriter().write(
				mapper.writeValueAsString(testResult));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
