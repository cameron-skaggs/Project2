package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {
	public static void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		switch(request.getRequestURI()) {
		case "/ProjectTwo/TestHomeServlet.sabotage":
			Service.home(request, response);
			break;
		case "/ProjectTwo/TestManageBatchServlet.sabotage":
			Service.manageBatch(request, response);
			break;
		case "/ProjectTwo/TestAssessBatchServlet.sabotage":
			Service.assessBatch(request, response);
			break;
		case "/ProjectTwo/TestReportsServlet.sabotage":
			Service.reports(request, response);
			break;
		default:
			Service.error(request, response);
		}
	}
}
