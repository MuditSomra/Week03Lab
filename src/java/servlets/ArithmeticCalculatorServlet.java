/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "-----");
           getServletContext().getRequestDispatcher("/WEB-INF/Arithmeticcalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              
              String message="";
        String first = request.getParameter("first"),
                second = request.getParameter("second");
          request.setAttribute("first", first);
        request.setAttribute("second", second);
        int firstInt = 0, secondInt = 0;
        String operator = request.getParameter("operator");
        if(first==null || first=="" || second==null || second==""){
           request.setAttribute("message", "invalid"); 
           getServletContext().getRequestDispatcher("/WEB-INF/Arithmeticcalculator.jsp").forward(request, response);
           return;
           
        }
        try
        {
            firstInt = Integer.parseInt(first);
            secondInt = Integer.parseInt(second);             
        }
        catch (Exception ex)
        {
            request.setAttribute("message", "invalid");
             getServletContext().getRequestDispatcher("/WEB-INF/Arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        if (operator.equals("+"))
        {
            message = "" + (firstInt + secondInt);
        }
        else if (operator.equals("-"))
        {
            message = "" + (firstInt - secondInt);
        }
        else if (operator.equals("*"))
        {
            message = "" + (firstInt * secondInt);
        }
        else if (operator.equals("%"))
        {
            message = "" + (firstInt % secondInt);
        }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("operator", operator);        
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/Arithmeticcalculator.jsp").forward(request, response);
    }

  
}
