package Controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MyDao;
import DTO.Staff;

@WebServlet("/StaffSignup")
public class StaffSignup extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name =req.getParameter("name");
	String mail=req.getParameter("mail");
	String password=req.getParameter("password");
	Long mobile=Long.parseLong(req.getParameter("mobile"));
	Date birthdate=Date.valueOf(req.getParameter("birthdate"));
	String gender = req.getParameter("gender");
	
	int age = LocalDate.now().getYear()-birthdate.toLocalDate().getYear();
	Staff staff= new Staff();
	staff.setName(name);
	staff.setMobile(mobile);
	staff.setEmail(mail);
	staff.setPassword(password);
	staff.setBirthdate(birthdate);
	staff.setGender(gender);
	
	MyDao dao= new MyDao();
	 dao.saveStaff(staff);
	 resp.getWriter().print("<h1>Staff account created successfully</h1>");
	 resp.getWriter().print("<h1>Your staff id is : "+staff.getId()+"</h1>");
	 req.getRequestDispatcher("HomePage.html").include(req, resp);
}
}
