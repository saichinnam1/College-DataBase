/*
 * Search for student Details by ID
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;
import model.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SearchStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchStudent</title>");            
            out.println("</head>");
            out.println("<body>");
            int sid=Integer.parseInt(request.getParameter("sid"));
          //  out.println(sid);
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            StudentDAO sdao=(StudentDAO)context.getBean("sdao");
            Student stud=new Student();
            stud=sdao.getStudentById(sid);
            out.println("<table border=1>");
            out.println("<tr><th>SID</th><th>Name</th><th>DOB</th></tr>");
            out.println("<tr><td>"+stud.getSid()+"</td>");
            out.println("<td>"+stud.getFirstname()+"</td>");
             out.println("<td>"+stud.getLastname()+"</td>");
            out.println("<td>"+stud.getDob()+"</td></tr>");
            out.println("</table");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}