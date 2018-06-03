package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {
	public static void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		System.out.println(request.getRequestURI());
		switch(request.getRequestURI()) {
		case "/ProjectTwo/TestHomeServlet.do":
			Service.home(request, response);
			break;
		case "/ProjectTwo/TestManageBatchServlet.do":
			Service.manageBatch(request, response);
			break;
		case "/ProjectTwo/TestAssessBatchServlet.do":
			Service.assessBatch(request, response);
			break;
		case "/ProjectTwo/TestReportsServlet.do":
			Service.reports(request, response);
			break;
		default:
			Service.error(request, response);
		}
	}
}
