package tdgr1.meng3.webService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ServletDeleteAccount extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get the user object first which is the key
        String userTarget = request.getParameter("username");
        // than get the list from servletContext
        List<user> userList = (List<user>) this.getServletContext().getAttribute("list");
        //then look up
        Iterator iterator = userList.listIterator();
        while (iterator.hasNext()){
            String userObject = iterator.next().toString();
            if (userObject.equals(userTarget)){
                iterator.remove();
                HttpSession session = request.getSession();
                session.invalidate();
                request.getRequestDispatcher("register.jsp").forward(request,response);
            }
        }

    }
}
