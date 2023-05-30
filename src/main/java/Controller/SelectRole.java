package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/selectrole")
public class SelectRole extends HttpServlet{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String role = req.getParameter("Role");
    if(role.equals("Staff")){
    	req.getRequestDispatcher("StaffSignup.html").forward(req, resp);
    }
    else
		req.getRequestDispatcher("Doctor_Signup.html").forward(req, resp);
   }
}
