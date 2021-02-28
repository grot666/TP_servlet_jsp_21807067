package tdgr1.meng3.webService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ServletSignUp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // same from the tp .just like they say "Stop Trying to Reinvent the Wheel”
        PrintWriter out = resp.getWriter();
        // get the output flux to show front pages
        out.println("<!DOCTYPE html><html><body>");
        out.println("  <form method=\"POST\">");
        out.println("    <label>username:<input type=\"text\" name=\"username\" required=\"true\" /></label><br />");
        out.println("    <label>firstname:<input type=\"text\" name=\"firstname\" required=\"true\" /></label><br />");
        out.println("    <label>lastname:<input type=\"text\" name=\"lastname\" required=\"true\" /></label><br />");
        out.println("    <label>mot de passe:<input type=\"password\" name=\"password\" required=\"true\" /></label><br />");
        out.println("    <input type=\"submit\" value=\"signup\" />");
        out.println("  </form>");
        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post once");

        PrintWriter out = resp.getWriter();
        String userName = req.getParameter("username");
        String firstName = req.getParameter("firstname");
        String lastName = req.getParameter("lastname");
        String passWard = req.getParameter("password");
        user theUser = new user(userName,firstName,lastName,passWard);
        String allInfo = theUser.getAll();

        // test for redirection

        if (firstName.equals(userName)){
            resp.sendRedirect("register.jsp");
        }
        //start the real part
        //i got 2 ideas here
        //following is the first idea.
        //first of all get a servletContext object
        ServletContext servletContext = this.getServletContext();
        //than check the username
        //to do that we need a list of users first
        List<user> userList = (List<user>) this.getServletContext().getAttribute("list");
        //than check
        for (user u :
                userList) {
            if (u.userName.equals(userName))
            {
                //if already exist than reDir to register.jsp
                req.getRequestDispatcher("register.jsp");
                return;

            }
        }
        //add the user to context
        userList.add(theUser);
        this.getServletContext().setAttribute("list",userList);
        //after signed up jump to
       resp.sendRedirect("index.jsp");

        //front out put
        out.println("<!DOCTYPE html><html><body>");
        out.println("  <form method=\"POST\">");
        out.println("<span>");
        out.println(userName+":"+passWard);
        out.print(allInfo);
        out.println("</span>");
        out.println("</body></html>");
    }
}
//i am thinking about stock info by using a class,well i don t know
class user{
    String userName;
    String firstName;
    String lastName;
    String passWard;
    //i know they should be private here ,but i just dont
    user(String username,String firstname,String lastname,String passward){
        this.firstName = firstname;
        this.lastName = lastname;
        this.userName = username;
        this.passWard = passward;
    }
    //test of my conception . it may work
    public String getAll() {
        return "un :" + userName+" fn :"+firstName+" ln :"+lastName+" ps :"+passWard;
    }
}
