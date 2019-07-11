package llk0056.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class sBIdErrorHandling extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idNum = request.getParameter("BID");
        if(idNum.isEmpty()){
            RequestDispatcher req = request.getRequestDispatcher("invalid");
            req.include(request, response);
        }
        else{
            RequestDispatcher req = request.getRequestDispatcher("sBIDView");
            req.forward(request, response);
        }
    }
}
