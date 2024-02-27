
package tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SignupServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("conpassword");

if (!username.matches("[a-zA-Z0-9]+")) {
   // response.getWriter().write("Invalid username. Use only letters and numbers.");
    request.setAttribute("errorMessage", "Invalid username. Use only letters and numbers.");
            request.getRequestDispatcher("/Index.jsp").forward(request, response);
   
    return;
}

if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
  //  response.getWriter().write("Password must contain at least one special character.");
      request.setAttribute("errorMessage", "Password must contain at least one special character.");
            request.getRequestDispatcher("/Index.jsp").forward(request, response);
  
    return;
}

if (!password.equals(confirmPassword)) {
  //  response.getWriter().write("Passwords do not match.");
     request.setAttribute("errorMessage", "Passwords do not match.");
            request.getRequestDispatcher("/Index.jsp").forward(request, response);
  
    return;
}

//response.getWriter().write("Registration successful!");
      request.setAttribute("successMessage", "Registration successful!");
        request.getRequestDispatcher("/Index.jsp").forward(request, response);

    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
