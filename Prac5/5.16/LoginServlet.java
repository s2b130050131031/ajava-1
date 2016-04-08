package action;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        try {
            LoginHandler lh=new LoginHandler();
            boolean a=lh.authenticate(name, pwd);
            if(a){
                response.sendRedirect("Success.jsp");
            }else{
                RequestDispatcher rd=request.getRequestDispatcher("login.html");
                out.println("<h1>Wrong info</h1>");
                rd.include(request,response);   
            }           
        }catch(Exception e){} 
        finally {
            out.close();
        }
    }
}
