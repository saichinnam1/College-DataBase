/*
 * Add studnet details to database
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

public class AddStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddStudent</title>");            
            out.println("</head>");
            out.println("<body>");
            String firstname=request.getParameter("firstname");
            String Lastname =request.getParameter("Lastname");
            String dob=request.getParameter("dob");
            out.println("Name:"+firstname);
            out.println("Name:"+Lastname);
            out.println("dob:"+dob);
            ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
            StudentDAO sdao=(StudentDAO)context.getBean("sdao");
            Student stud=new Student();
            stud.setFirstname(firstname);
            stud.setFirstname(Lastname);
            stud.setDob(dob);
            int i=sdao.saveRecord(stud);
            if(i>0)
            {
                out.println("Thank Your For Registration!");
            }
            
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