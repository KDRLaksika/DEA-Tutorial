
package tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Tableservlet extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            
            
            out.print("<h3>Request Method: "+ request.getMethod()+"<br>");
            out.print("Request URI: "+ request.getRequestURI()+"<br>");
            out.print("Request Protocol: "+ request.getProtocol()+"<br>");
            out.print("</h3>");
            
            Enumeration headerNames = request.getHeaderNames();
            
            out.println("<table border='1'>");
            
            out.print("<tr>");
            out.print("<th>Header name</th>");
            out.print("<th>Header value</th>");
            out.print("</tr>");
            
          
            while(headerNames.hasMoreElements()){
                String headerName = (String) headerNames.nextElement();
                out.println("<tr>");
                out.println("<td>"+headerName+"</td>");
                out.println("<td>"+request.getHeader(headerName)+"</td>");
                out.println("</tr>");
            }
            
            out.println("</table>"); 
            out.println("</body>");
            out.println("</html>");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
