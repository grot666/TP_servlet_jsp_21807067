package tdgr1.meng3.webService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServletInit extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //create a collection of list here
        List<user> list = new ArrayList<user>();
        //using list here to realize the Arraylist
        //once tomcat run it will run too.nice!
        //set load-on-startup 1
        this.getServletContext().setAttribute("list", list);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
