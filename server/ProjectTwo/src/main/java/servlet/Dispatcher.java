package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {
	public static void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		switch(request.getRequestURI()) {
		case "/ProjectTwo/TestHomeServlet.dude":
			Service.home(request, response);
			break;
		case "/ProjectTwo/TestManageBatchServlet.dude":
			Service.manageBatch(request, response);
			break;
		case "/ProjectTwo/TestAssessBatchServlet.dude":
			Service.assessBatch(request, response);
			break;
		case "/ProjectTwo/TestReportsServlet.dude":
			Service.reports(request, response);
			break;
		default:
			Service.error(request, response);
		}
	}
}
