package tdgr1.meng3.webService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletSignUp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        /*
         * The HTTP method used when the form will be submitted is POST.
         * The form's attribute "action" may be used to set the path to which
         * the form will be submitted, like action="/auth/login". If action is
         * empty or not given (as here), the default behaviour is to submit the
         * form to the current path. So in this example, the same path will be
         * used, that means the same servlet will be called, but that's the
         * method doPost() that will respond.
         */
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
        String username = req.getParameter("username");
        out.println("<!DOCTYPE html><html><body>");
        out.println("  <form method=\"POST\">");
        out.println("<span>");
        out.println(username);
        out.println("</span>");
        out.println("</body></html>");
    }
}
