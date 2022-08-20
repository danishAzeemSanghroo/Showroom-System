/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Beans.DatabaseManager;
import Beans.VehicleBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 *
 * @author DANISH
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int counter=3;
            String username=request.getParameter("username");
            String pass=request.getParameter("pass");
            if(username.equals("danish") && pass.equals("12345")){
               // welcome1(out);
//            out.println("Welcome <br>"+"username="+username+"<br>"+"password="+pass);
                response.sendRedirect("welcome.jsp");
//                //response.sendRedirect("index.html");
            }
            else 
//                msg="Incorrect username or  password";
//                out.println("<script language='Javascript'>");
//                out.println("alert('"+msg+"');");
//                out.println("</script>");
                response.sendRedirect("Login.html");//resendAuthForm(out);
                
               // response.sendRedirect("Login.html");
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    /*private void welcome1(PrintWriter out) throws Exception {
        VehicleBean bean=DatabaseManager.getVehicle();
        System.out.println(bean);
        out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    \n" +
"    <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\n" +
"\n" +
"    <!-- font awesome cdn link  -->\n" +
"    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n" +
"\n" +
"    <!-- custom css file link  -->\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"\n" +
"</head>\n" +
"<body>\n" +
"    \n" +
"<header class=\"header\">\n" +
"\n" +
"    <div id=\"menu-btn\" class=\"fas fa-bars\"></div>\n" +
"\n" +
"    <a href=\"#\" class=\"logo\"> <span>max</span>wheels </a>\n" +
"\n" +
"    <nav class=\"navbar\">\n" +
"        <a href=\"#home\">home</a>\n" +
"        <a href=\"#vehicles\">vehicles</a>\n" +
"        <a href=\"#services\">services</a>\n" +
"        <a href=\"#featured\">featured</a>\n" +
"        <a href=\"#reviews\">reviews</a>\n" +
"        <a href=\"#contact\">contact</a>\n" +
"    </nav>\n" +
"\n" +
"   <div id=\"login-btn\">\n" +
"       <form action=\"Login.html\">\n" +
"        <button class=\"btn\" >logout</button>\n" +
"        <i class=\"far fa-user\"></i>\n" +
"       </form>\n" +
"    </div>\n" +
"    \n" +
"\n" +
"</header> \n" +
"    \n" +
"<!--<div class=\"login-form-container\">\n" +
"\n" +
"    <span id=\"close-login-form\" class=\"fas fa-times\"></span>\n" +
"\n" +
"    <form action=\"\">\n" +
"        <h3>user login</h3>\n" +
"        <input type=\"email\" placeholder=\"email\" class=\"box\">\n" +
"        <input type=\"password\" placeholder=\"password\" class=\"box\">\n" +
"        <p> forget your password <a href=\"#\">click here</a> </p>\n" +
"        <input type=\"submit\" value=\"login\" class=\"btn\">\n" +
"        <p>or login with</p>\n" +
"        <div class=\"buttons\">\n" +
"            <a href=\"#\" class=\"btn\"> google </a>\n" +
"            <a href=\"#\" class=\"btn\"> facebook </a>\n" +
"        </div>\n" +
"        <p> don't have an account <a href=\"#\">create one</a> </p>\n" +
"    </form>\n" +
"\n" +
"</div>\n" +
"    -->\n" +
"\n" +
"<section class=\"home\" id=\"home\">\n" +
"\n" +
"    <h3 data-speed=\"-2\" class=\"home-parallax\">find your car</h3>\n" +
"\n" +
"    <img data-speed=\"5\" class=\"home-parallax\" src=\"image/home-img.png\" alt=\"\">\n" +
"    <form action=\"SearchVehicles\" method=\"post\">\n" +
"      <!--  <a data-speed=\"7\" href=\"#\" class=\"btn home-parallax\">explore cars</a> comment -->\n" +
"      <h2>Vehicle<h2>\n" +
"      <select>\n" +
"            <option values=\"vehicles\">"+bean.getVehicle()+"</option>\n" +
"      </select>\n" +
"      <br>\n" +
"      <h2>Model</h2>\n" +
"      <select>\n" +
"            <option value=\"model\">"+bean.getModel()+"</option>\n" +
"      </select>   \n" +
"      <br>\n" +
"      <h2>Color</h2>\n" +
"      <select>\n" +
"            <option value=\"color\">"+bean.getColor()+"</option>\n" +
"      </select>     \n" +
"      <br>\n" +
"      <h2>Engine</h2>\n" +
"      <select>\n" +
"            <option value=\"engine\">"+bean.getEngine()+"</option>\n" +
"      </select>  \n" +
"      <br>\n" +
"      <h2>Fuel</h2>\n" +
"      <select>\n" +
"            <option value=\"fuel\">"+bean.getFuel()+"</option>\n" +
"      </select>  \n" +
"      <br>\n" +
"      <h2>Registered City</h2>\n" +
"      <select>\n" +
"            <option value=\"registeredCity\">"+bean.getRegisteredCity()+"</option>\n" +
"      </select>  \n" +
"      <br>\n" +
"      <h2>Registered Year</h2>\n" +
"      <select>\n" +
"            <option value=\"registeredYear\">"+bean.getRegisteredYear()+"</option>\n" +
"      </select>  \n" +
"      <br>\n" +
"      <h2>Price less than</h2>\n" +
"      <select>\n" +
"            <option value=\"priceLessThan\">"+bean.getPrice()+"</option>\n" +
"      </select>  \n" +
"      <br>\n" +
"      <h2>Status</h2>\n" +
"      <select>\n" +
"            <option value=\"status\">"+bean.getStatus()+"</option>\n" +
"      </select>  \n" +
"      <br>      \n" +
"      <input type=\"submit\" value=\"Search\" class=\"btn\">\n" +
"    </form>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"icons-container\">\n" +
"\n" +
"    <div class=\"icons\">\n" +
"        <i class=\"fas fa-home\"></i>\n" +
"        <div class=\"content\">\n" +
"            <h3>150+</h3>\n" +
"            <p>branches</p>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <div class=\"icons\">\n" +
"        <i class=\"fas fa-car\"></i>\n" +
"        <div class=\"content\">\n" +
"            <h3>4770+</h3>\n" +
"            <p>cars sold</p>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <div class=\"icons\">\n" +
"        <i class=\"fas fa-users\"></i>\n" +
"        <div class=\"content\">\n" +
"            <h3>320+</h3>\n" +
"            <p>happy clients</p>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <div class=\"icons\">\n" +
"        <i class=\"fas fa-car\"></i>\n" +
"        <div class=\"content\">\n" +
"            <h3>1500+</h3>\n" +
"            <p>news cars</p>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"vehicles\" id=\"vehicles\">\n" +
"\n" +
"    <h1 class=\"heading\"> popular <span>vehicles</span> </h1>\n" +
"\n" +
"    <div class=\"swiper vehicles-slider\">\n" +
"\n" +
"        <div class=\"swiper-wrapper\">\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/vehicle-1.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"price\"> <span>price : </span> $62,000/- </div>\n" +
"                    <p>\n" +
"                        new\n" +
"                        <span class=\"fas fa-circle\"></span> 2021\n" +
"                        <span class=\"fas fa-circle\"></span> automatic\n" +
"                        <span class=\"fas fa-circle\"></span> petrol\n" +
"                        <span class=\"fas fa-circle\"></span> 183mph\n" +
"                    </p>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/vehicle-2.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"price\"> <span>price : </span> $62,000/- </div>\n" +
"                    <p>\n" +
"                        new\n" +
"                        <span class=\"fas fa-circle\"></span> 2021\n" +
"                        <span class=\"fas fa-circle\"></span> automatic\n" +
"                        <span class=\"fas fa-circle\"></span> petrol\n" +
"                        <span class=\"fas fa-circle\"></span> 183mph\n" +
"                    </p>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/vehicle-3.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"price\"> <span>price : </span> $62,000/- </div>\n" +
"                    <p>\n" +
"                        new\n" +
"                        <span class=\"fas fa-circle\"></span> 2021\n" +
"                        <span class=\"fas fa-circle\"></span> automatic\n" +
"                        <span class=\"fas fa-circle\"></span> petrol\n" +
"                        <span class=\"fas fa-circle\"></span> 183mph\n" +
"                    </p>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/vehicle-4.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"price\"> <span>price : </span> $62,000/- </div>\n" +
"                    <p>\n" +
"                        new\n" +
"                        <span class=\"fas fa-circle\"></span> 2021\n" +
"                        <span class=\"fas fa-circle\"></span> automatic\n" +
"                        <span class=\"fas fa-circle\"></span> petrol\n" +
"                        <span class=\"fas fa-circle\"></span> 183mph\n" +
"                    </p>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/vehicle-5.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"price\"> <span>price : </span> $62,000/- </div>\n" +
"                    <p>\n" +
"                        new\n" +
"                        <span class=\"fas fa-circle\"></span> 2021\n" +
"                        <span class=\"fas fa-circle\"></span> automatic\n" +
"                        <span class=\"fas fa-circle\"></span> petrol\n" +
"                        <span class=\"fas fa-circle\"></span> 183mph\n" +
"                    </p>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/vehicle-6.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"price\"> <span>price : </span> $62,000/- </div>\n" +
"                    <p>\n" +
"                        new\n" +
"                        <span class=\"fas fa-circle\"></span> 2021\n" +
"                        <span class=\"fas fa-circle\"></span> automatic\n" +
"                        <span class=\"fas fa-circle\"></span> petrol\n" +
"                        <span class=\"fas fa-circle\"></span> 183mph\n" +
"                    </p>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"        </div>\n" +
"\n" +
"        <div class=\"swiper-pagination\"></div>\n" +
"\n" +
"    </div>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"services\" id=\"services\">\n" +
"\n" +
"    <h1 class=\"heading\"> our <span>services</span> </h1>\n" +
"\n" +
"    <div class=\"box-container\">\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <i class=\"fas fa-car\"></i>\n" +
"            <h3>car selling</h3>\n" +
"            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>\n" +
"            <a href=\"#\" class=\"btn\"> read more</a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <i class=\"fas fa-tools\"></i>\n" +
"            <h3>parts repair</h3>\n" +
"            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>\n" +
"            <a href=\"#\" class=\"btn\"> read more</a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <i class=\"fas fa-car-crash\"></i>\n" +
"            <h3>car insurance</h3>\n" +
"            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>\n" +
"            <a href=\"#\" class=\"btn\"> read more</a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <i class=\"fas fa-car-battery\"></i>\n" +
"            <h3>battery replacement</h3>\n" +
"            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>\n" +
"            <a href=\"#\" class=\"btn\"> read more</a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <i class=\"fas fa-gas-pump\"></i>\n" +
"            <h3>oil change</h3>\n" +
"            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>\n" +
"            <a href=\"#\" class=\"btn\"> read more</a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <i class=\"fas fa-headset\"></i>\n" +
"            <h3>24/7 support</h3>\n" +
"            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>\n" +
"            <a href=\"#\" class=\"btn\"> read more</a>\n" +
"        </div>\n" +
"\n" +
"    </div>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"featured\" id=\"featured\">\n" +
"\n" +
"    <h1 class=\"heading\"> <span>featured</span> cars </h1>\n" +
"\n" +
"    <div class=\"swiper featured-slider\">\n" +
"\n" +
"       <div class=\"swiper-wrapper\">\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/car-1.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                    <div class=\"price\">$55,000/-</div>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/car-2.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                    <div class=\"price\">$55,000/-</div>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/car-3.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                    <div class=\"price\">$55,000/-</div>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/car-4.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <h3>new model</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                    <div class=\"price\">$55,000/-</div>\n" +
"                    <a href=\"#\" class=\"btn\">check out</a>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"       </div>\n" +
"\n" +
"       <div class=\"swiper-pagination\"></div>\n" +
"\n" +
"    </div>\n" +
"\n" +
"    <div class=\"swiper featured-slider\">\n" +
"\n" +
"        <div class=\"swiper-wrapper\">\n" +
" \n" +
"             <div class=\"swiper-slide box\">\n" +
"                 <img src=\"image/car-5.png\" alt=\"\">\n" +
"                 <div class=\"content\">\n" +
"                     <h3>new model</h3>\n" +
"                     <div class=\"stars\">\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star-half-alt\"></i>\n" +
"                     </div>\n" +
"                     <div class=\"price\">$55,000/-</div>\n" +
"                     <a href=\"#\" class=\"btn\">check out</a>\n" +
"                 </div>\n" +
"             </div>\n" +
" \n" +
"             <div class=\"swiper-slide box\">\n" +
"                 <img src=\"image/car-6.png\" alt=\"\">\n" +
"                 <div class=\"content\">\n" +
"                     <h3>new model</h3>\n" +
"                     <div class=\"stars\">\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star-half-alt\"></i>\n" +
"                     </div>\n" +
"                     <div class=\"price\">$55,000/-</div>\n" +
"                     <a href=\"#\" class=\"btn\">check out</a>\n" +
"                 </div>\n" +
"             </div>\n" +
" \n" +
"             <div class=\"swiper-slide box\">\n" +
"                 <img src=\"image/car-7.png\" alt=\"\">\n" +
"                 <div class=\"content\">\n" +
"                     <h3>new model</h3>\n" +
"                     <div class=\"stars\">\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star-half-alt\"></i>\n" +
"                     </div>\n" +
"                     <div class=\"price\">$55,000/-</div>\n" +
"                     <a href=\"#\" class=\"btn\">check out</a>\n" +
"                 </div>\n" +
"             </div>\n" +
" \n" +
"             <div class=\"swiper-slide box\">\n" +
"                 <img src=\"image/car-8.png\" alt=\"\">\n" +
"                 <div class=\"content\">\n" +
"                     <h3>new model</h3>\n" +
"                     <div class=\"stars\">\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star\"></i>\n" +
"                         <i class=\"fas fa-star-half-alt\"></i>\n" +
"                     </div>\n" +
"                     <div class=\"price\">$55,000/-</div>\n" +
"                     <a href=\"#\" class=\"btn\">check out</a>\n" +
"                 </div>\n" +
"             </div>\n" +
" \n" +
"        </div>\n" +
" \n" +
"        <div class=\"swiper-pagination\"></div>\n" +
" \n" +
"     </div>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"newsletter\">\n" +
"    \n" +
"    <h3>subscribe for latest updates</h3>\n" +
"    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatum, suscipit.</p>\n" +
"\n" +
"   <form action=\"\">\n" +
"        <input type=\"email\" placeholder=\"enter your email\">\n" +
"        <input type=\"submit\" value=\"subscribe\">\n" +
"   </form>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"reviews\" id=\"reviews\">\n" +
"\n" +
"    <h1 class=\"heading\"> client's <span>review</span> </h1>\n" +
"\n" +
"    <div class=\"swiper review-slider\">\n" +
"\n" +
"        <div class=\"swiper-wrapper\">\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/pic-1.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>\n" +
"                    <h3>john deo</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/pic-2.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>\n" +
"                    <h3>john deo</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/pic-3.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>\n" +
"                    <h3>john deo</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/pic-4.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>\n" +
"                    <h3>john deo</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/pic-5.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>\n" +
"                    <h3>john deo</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"swiper-slide box\">\n" +
"                <img src=\"image/pic-6.png\" alt=\"\">\n" +
"                <div class=\"content\">\n" +
"                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>\n" +
"                    <h3>john deo</h3>\n" +
"                    <div class=\"stars\">\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star\"></i>\n" +
"                        <i class=\"fas fa-star-half-alt\"></i>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"\n" +
"        </div>\n" +
"\n" +
"        <div class=\"swiper-pagination\"></div>\n" +
"\n" +
"    </div>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"contact\" id=\"contact\">\n" +
"\n" +
"    <h1 class=\"heading\"><span>contact</span> us</h1>\n" +
"\n" +
"    <div class=\"row\">\n" +
"\n" +
"        <iframe class=\"map\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d30153.788252261566!2d72.82321484621745!3d19.141690214227783!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b63aceef0c69%3A0x2aa80cf2287dfa3b!2sJogeshwari%20West%2C%20Mumbai%2C%20Maharashtra%20400047!5e0!3m2!1sen!2sin!4v1632137920043!5m2!1sen!2sin\" allowfullscreen=\"\" loading=\"lazy\"></iframe>\n" +
"\n" +
"        <form action=\"\">\n" +
"            <h3>get in touch</h3>\n" +
"            <input type=\"text\" placeholder=\"your name\" class=\"box\">\n" +
"            <input type=\"email\" placeholder=\"your email\" class=\"box\">\n" +
"            <input type=\"tel\" placeholder=\"subject\" class=\"box\">\n" +
"            <textarea placeholder=\"your message\" class=\"box\" cols=\"30\" rows=\"10\"></textarea>\n" +
"            <input type=\"submit\" value=\"send message\" class=\"btn\">\n" +
"        </form>\n" +
"\n" +
"    </div>\n" +
"\n" +
"</section>\n" +
"\n" +
"<section class=\"footer\" id=\"footer\">\n" +
"\n" +
"    <div class=\"box-container\">\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <h3>our branches</h3>\n" +
"            <a href=\"#\"> <i class=\"fas fa-map-marker-alt\"></i> india </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-map-marker-alt\"></i> japan </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-map-marker-alt\"></i> france </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-map-marker-alt\"></i> russia </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-map-marker-alt\"></i> USA </a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <h3>quick links</h3>\n" +
"            <a href=\"#\"> <i class=\"fas fa-arrow-right\"></i> home </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-arrow-right\"></i> vehicles </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-arrow-right\"></i> services </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-arrow-right\"></i> featured </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-arrow-right\"></i> reviews </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-arrow-right\"></i> contact </a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <h3>contact info</h3>\n" +
"            <a href=\"#\"> <i class=\"fas fa-phone\"></i> +123-456-7890 </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-phone\"></i> +111-222-3333 </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-envelope\"></i> shaikhanas@gmail.com </a>\n" +
"            <a href=\"#\"> <i class=\"fas fa-map-marker-alt\"></i> mumbai, india - 400104 </a>\n" +
"        </div>\n" +
"\n" +
"        <div class=\"box\">\n" +
"            <h3>contact info</h3>\n" +
"            <a href=\"#\"> <i class=\"fab fa-facebook-f\"></i> facebook </a>\n" +
"            <a href=\"#\"> <i class=\"fab fa-twitter\"></i> twitter </a>\n" +
"            <a href=\"#\"> <i class=\"fab fa-instagram\"></i> instagram </a>\n" +
"            <a href=\"#\"> <i class=\"fab fa-linkedin\"></i> linkedin </a>\n" +
"            <a href=\"#\"> <i class=\"fab fa-pinterest\"></i> pinterest </a>\n" +
"        </div>\n" +
"\n" +
"    </div>\n" +
"\n" +
"    <div class=\"credit\"> created by mr. web designer | all rights reserved </div>\n" +
"\n" +
"</section>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<script src=\"https://unpkg.com/swiper@7/swiper-bundle.min.js\"></script>\n" +
"\n" +
"<script src=\"js/script.js\"></script>\n" +
"\n" +
"</body>\n" +
"</html>");
    }

    private void resendAuthForm(PrintWriter out) {
out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\" >\n" +
"<head>\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <title>Login Page in HTML with CSS Code Example</title>\n" +
"  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n" +
"\n" +
"\n" +
"<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\"><link rel=\"stylesheet\" href=\"css/login.css\">\n" +
"\n" +
"</head>\n" +
"<body>\n" +
"<!-- partial:index.partial.html -->\n" +
"<div class=\"box-form\">\n" +
"	<div class=\"left\">\n" +
"		<div class=\"overlay\">\n" +
"		\n" +
"		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
"		Curabitur et est sed felis aliquet sollicitudin</p>\n" +
"		<span>\n" +
"			<p>login with social media</p>\n" +
"			<a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"> Login with Facebook</i></a>\n" +
"			<a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i> Login with Twitter</a>\n" +
"		</span>\n" +
"		</div>\n" +
"	</div>\n" +
"	\n" +
"	\n" +
"		<div class=\"right\">\n" +
"		<h5>Login</h5>\n" +
"		<p>Don't have an account? <a href=\"#\">Creat Your Account</a> it takes less than a minute</p>\n" +
"                        <h3>Incorrect Username or Password<h3><br> Try Again" +
"                <form action=\"login\" method=\"post\">\n" +
"                <div class=\"inputs\">\n" +
"			<input type=\"text\" name=\"username\" placeholder=\"user name\">\n" +
"			<br>\n" +
"			<input type=\"password\" name=\"pass\" placeholder=\"password\">\n" +
"                        \n" +
"		</div>\n" +
"                \n" +
"			<br><br>\n" +
"			\n" +
"		<div class=\"remember-me--forget-password\">\n" +
"				<!-- Angular -->\n" +
"	<label>\n" +
"		<input type=\"checkbox\" name=\"item\" checked/>\n" +
"		<span class=\"text-checkbox\">Remember me</span>\n" +
"	</label>\n" +
"			<p>forget password?</p>\n" +
"		</div>\n" +
"			\n" +
"			<br>\n" +
"                        <button>Login</button>\n" +
"                </form>\n" +
"	</div>\n" +
"	\n" +
"</div>\n" +
"<!-- partial -->\n" +
"  \n" +
"</body>\n" +
"</html>\n" +
"");
    }
*/
}
