/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class AgeServlets extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    
      
        String age = request.getParameter("age");
        int ageIntVal;
        if (age == null || age == "") 
        {
            request.setAttribute("ageEmpty", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
            return;
        }
        try{
             ageIntVal = Integer.parseInt(age);
        }
        catch (RuntimeException Ex){
                request.setAttribute("ageEmpty", "You must enter a proper age");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
            return;
            }
        
//        Parsing the value of age to integer and then increasing it by 1
       
        ageIntVal += 1;
        
//        Passing the age value to the jsp
        request.setAttribute("ageIntVal", "Your next birthday will be: " +ageIntVal);
        
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
        .forward(request, response);
      
    }

  
   
}
