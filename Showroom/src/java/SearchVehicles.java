/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Beans.DatabaseManager;
import Beans.VehicleBean;
import com.healthmarketscience.jackcess.Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DANISH
 */
@WebServlet(urlPatterns = {"/SearchVehicles"})
public class SearchVehicles extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           String vehicles=request.getParameter("vehicles");
           String model=request.getParameter("model");
           String color=request.getParameter("color");
           String demand=request.getParameter("demand");
           String drive=request.getParameter("drive");
           String engine=request.getParameter("engine");
           String fuel=request.getParameter("fuel");
           String transmission=request.getParameter("transmission");
           String registeredCity=request.getParameter("registeredCity");
           String registeredYear=request.getParameter("registeredYear");
           String featuresAndDescription=request.getParameter("featuresAndDescription");
           String price=request.getParameter("priceLessThan");
           String status=request.getParameter("status");
         
           
         try{  
          ArrayList<VehicleBean> array = DatabaseManager.searchVehicles(vehicles);
         if(array!=null){
              HttpSession httpSession = (HttpSession)request.getSession();
              httpSession.setAttribute("array", array);
              response.sendRedirect("search.jsp");
          
         }
              
          
//         for(VehicleBean bean : array){
//             out.println(bean.getVehicle()+" "+bean.getModel()+" "+bean.getColor()+" "+bean.getDemand()+" "+bean.getDrive()+" "+bean.getEngine()+" "+bean.getFuel()+" "+bean.getTransmission()+" "+bean.getRegisteredCity()+" "+bean.getRegisteredYear()+" "+bean.getFeaturesAndDescription()+" "+bean.getPrice()+" "+bean.getStatus());
//        
//         }
          
         }catch(Exception e)
         {
         e.printStackTrace();
         }
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
