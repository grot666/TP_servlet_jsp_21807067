package tdgr1.meng3.webService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ServletLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //first get password and username
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        //secondly our old friend collection
        List<user> list=(List<user>) this.getServletContext().getAttribute("list");
        //than check username and password
        //foreach here
        for(user user:list){
            //check user name
            if(username.equals(user.userName)){
                //i do know userName and password should be private ,but i just want trust others
                if(password.equals(user.passWord)){
                    //password corrected

                    //goto success.jsp set a session for welcome XXX
                    request.getSession().setAttribute("user",user.firstName +"."+user.lastName);
                    response.sendRedirect("success.jsp");
                    return;
                }
            }
        }

        request.setAttribute("msg","somethings wrong here...");
        request.getRequestDispatcher("register.jsp").forward(request,response);

    }
}
