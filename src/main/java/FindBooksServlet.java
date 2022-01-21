

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindBooksServlet
 */
@SuppressWarnings("serial")
@WebServlet("/booksfinder")
public class FindBooksServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//for get parameters like symbol or any other form fields
		String symbol = request.getParameter("symbol");
		
		response.setContentType("text/html");
		
		out.println("<html><body>");
		out.println("<h1>Requested Book: " + symbol + "</h1>");
		out.println("<h1>Price: "  + 1000 + "</h1>");
		out.println("</body> </html>");
				
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
		
		//for get parameters like symbol or any other form fields
		String symbol = request.getParameter("symbol");
		response.setContentType("text/html");
		
		out.println("<html><body>");
		out.println("<h1Requested Book: " + symbol + "</h1>");
		out.println("<h1>Price: "  + 1000 + "</h1>");
		out.println("</body> </html>");
        
	}

}
