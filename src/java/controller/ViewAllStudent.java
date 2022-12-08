/*
 * View all Students
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;
import model.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ViewAllStudent extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewAllStudent</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Details of Students are ...</h1>");
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            StudentDAO sdao=(StudentDAO)context.getBean("sdao");
            List<Student> list=new ArrayList<Student>();
            list=sdao.getAllStudentDetails();
            out.println("<table border=1>");
            out.println("<tr><th>SID</th><th>Name</th><th>Dob</th><th>Update</th></tr>");
            for(Student l:list)
            {
                out.println("<td>"+l.getSid()+"</td><td>"
                        +l.getFirstname()+"</td><td>"+l.getDob()+"</td>");
            out.println("<td><a href='Update.jsp?sid="+l.getSid()+"&firstname="+l.getFirstname()
                    +"&dob="+l.getDob()+""+"'>Update</a></td></tr>");
            }
            out.println("</table>");
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
    }// </editor-fold>

}