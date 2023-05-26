package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Auth
 */
@WebServlet("/Auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  String usuario = request.getParameter("usuario");
	  String password = request.getParameter("password");
	  
	  RequestDispatcher requestDispatcher;
	  
	  if(usuario.equals("admin") && password.equals("admin")) {
	    HttpSession session = request.getSession();
	    
	    session.setAttribute("usuario", usuario); // le acabo de añadir un atributo adicional a la session que es el nombre usuario
	    requestDispatcher = request.getRequestDispatcher("welcome.jsp");
	    
	  } else {
	    requestDispatcher = request.getRequestDispatcher("error.jsp");
	  }
	  
	  requestDispatcher.forward(request, response);
	}

}
