<%@page import="java.util.ArrayList"%>
<%@page import="Beans.DatabaseManager"%>
<%@page import="Beans.VehicleBean"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- custom css file link  -->
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
    
<header class="header">

    <div id="menu-btn" class="fas fa-bars"></div>

    <a href="#" class="logo"> <span>max</span>wheels </a>

    <nav class="navbar">
        <a href="#home">home</a>
        <a href="#vehicles">vehicles</a>
        <a href="#services">services</a>
        <a href="#featured">featured</a>
        <a href="#reviews">reviews</a>
        <a href="#contact">contact</a>
    </nav>



</header> 
    

<section class="home" id="home">

    <h3 data-speed="-2" class="home-parallax">Your search is Here</h3>

</section>  
   
<section class="icons-container">
        
      
    <%
        
        try{
        ArrayList<VehicleBean> array = (ArrayList<VehicleBean>)session.getAttribute("array");
           
         for(VehicleBean bean : array){
            
    %>



    <div class="icons">
        <i class="fas fa-car"></i>
        <div class="content">
            <p>Vehicle Name : <%= bean.getVehicle() %></p>
            <p>Model : <%= bean.getModel() %></p>
            <p>Color : <%= bean.getColor() %></p>
            <p>Demand : <%= bean.getDemand() %></p>
            <p>Drive : <%= bean.getDrive() %></p>
            <p>Engine : <%= bean.getEngine() %></p>
            <p>Fuel : <%= bean.getFuel() %></p>
            <p>Transmission : <%= bean.getTransmission()%></p>
            <p>Registered City : <%= bean.getRegisteredCity()%></p>
            <p>Registered Year : <%= bean.getRegisteredYear() %></p>
            <p>Features And Description : <%= bean.getFeaturesAndDescription() %></p>
            <p>Price : <%= bean.getPrice()%></p>
            <p>Status : <%= bean.getStatus()%></p>
            
        </div>
    </div>



<%
    }        
}catch(Exception e)
    {
    e.printStackTrace();
    }
%>              
</section>            
            

  
    
<section class="vehicles" id="vehicles">

    <h1 class="heading"> popular <span>vehicles</span> </h1>

    <div class="swiper vehicles-slider">

        <div class="swiper-wrapper">

            <div class="swiper-slide box">
                <img src="image/vehicle-1.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="price"> <span>price : </span> $62,000/- </div>
                    <p>
                        new
                        <span class="fas fa-circle"></span> 2021
                        <span class="fas fa-circle"></span> automatic
                        <span class="fas fa-circle"></span> petrol
                        <span class="fas fa-circle"></span> 183mph
                    </p>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/vehicle-2.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="price"> <span>price : </span> $62,000/- </div>
                    <p>
                        new
                        <span class="fas fa-circle"></span> 2021
                        <span class="fas fa-circle"></span> automatic
                        <span class="fas fa-circle"></span> petrol
                        <span class="fas fa-circle"></span> 183mph
                    </p>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/vehicle-3.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="price"> <span>price : </span> $62,000/- </div>
                    <p>
                        new
                        <span class="fas fa-circle"></span> 2021
                        <span class="fas fa-circle"></span> automatic
                        <span class="fas fa-circle"></span> petrol
                        <span class="fas fa-circle"></span> 183mph
                    </p>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/vehicle-4.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="price"> <span>price : </span> $62,000/- </div>
                    <p>
                        new
                        <span class="fas fa-circle"></span> 2021
                        <span class="fas fa-circle"></span> automatic
                        <span class="fas fa-circle"></span> petrol
                        <span class="fas fa-circle"></span> 183mph
                    </p>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/vehicle-5.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="price"> <span>price : </span> $62,000/- </div>
                    <p>
                        new
                        <span class="fas fa-circle"></span> 2021
                        <span class="fas fa-circle"></span> automatic
                        <span class="fas fa-circle"></span> petrol
                        <span class="fas fa-circle"></span> 183mph
                    </p>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/vehicle-6.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="price"> <span>price : </span> $62,000/- </div>
                    <p>
                        new
                        <span class="fas fa-circle"></span> 2021
                        <span class="fas fa-circle"></span> automatic
                        <span class="fas fa-circle"></span> petrol
                        <span class="fas fa-circle"></span> 183mph
                    </p>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

        </div>

        <div class="swiper-pagination"></div>

    </div>

</section>

<section class="services" id="services">

    <h1 class="heading"> our <span>services</span> </h1>

    <div class="box-container">

        <div class="box">
            <i class="fas fa-car"></i>
            <h3>car selling</h3>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>
            <a href="#" class="btn"> read more</a>
        </div>

        <div class="box">
            <i class="fas fa-tools"></i>
            <h3>parts repair</h3>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>
            <a href="#" class="btn"> read more</a>
        </div>

        <div class="box">
            <i class="fas fa-car-crash"></i>
            <h3>car insurance</h3>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>
            <a href="#" class="btn"> read more</a>
        </div>

        <div class="box">
            <i class="fas fa-car-battery"></i>
            <h3>battery replacement</h3>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>
            <a href="#" class="btn"> read more</a>
        </div>

        <div class="box">
            <i class="fas fa-gas-pump"></i>
            <h3>oil change</h3>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>
            <a href="#" class="btn"> read more</a>
        </div>

        <div class="box">
            <i class="fas fa-headset"></i>
            <h3>24/7 support</h3>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Corporis, nisi.</p>
            <a href="#" class="btn"> read more</a>
        </div>

    </div>

</section>

<section class="featured" id="featured">

    <h1 class="heading"> <span>featured</span> cars </h1>

    <div class="swiper featured-slider">

       <div class="swiper-wrapper">

            <div class="swiper-slide box">
                <img src="image/car-1.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <div class="price">$55,000/-</div>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/car-2.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <div class="price">$55,000/-</div>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/car-3.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <div class="price">$55,000/-</div>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/car-4.png" alt="">
                <div class="content">
                    <h3>new model</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                    <div class="price">$55,000/-</div>
                    <a href="#" class="btn">check out</a>
                </div>
            </div>

       </div>

       <div class="swiper-pagination"></div>

    </div>

    <div class="swiper featured-slider">

        <div class="swiper-wrapper">
 
             <div class="swiper-slide box">
                 <img src="image/car-5.png" alt="">
                 <div class="content">
                     <h3>new model</h3>
                     <div class="stars">
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star-half-alt"></i>
                     </div>
                     <div class="price">$55,000/-</div>
                     <a href="#" class="btn">check out</a>
                 </div>
             </div>
 
             <div class="swiper-slide box">
                 <img src="image/car-6.png" alt="">
                 <div class="content">
                     <h3>new model</h3>
                     <div class="stars">
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star-half-alt"></i>
                     </div>
                     <div class="price">$55,000/-</div>
                     <a href="#" class="btn">check out</a>
                 </div>
             </div>
 
             <div class="swiper-slide box">
                 <img src="image/car-7.png" alt="">
                 <div class="content">
                     <h3>new model</h3>
                     <div class="stars">
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star-half-alt"></i>
                     </div>
                     <div class="price">$55,000/-</div>
                     <a href="#" class="btn">check out</a>
                 </div>
             </div>
 
             <div class="swiper-slide box">
                 <img src="image/car-8.png" alt="">
                 <div class="content">
                     <h3>new model</h3>
                     <div class="stars">
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star"></i>
                         <i class="fas fa-star-half-alt"></i>
                     </div>
                     <div class="price">$55,000/-</div>
                     <a href="#" class="btn">check out</a>
                 </div>
             </div>
 
        </div>
 
        <div class="swiper-pagination"></div>
 
     </div>

</section>

<section class="newsletter">
    
    <h3>subscribe for latest updates</h3>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatum, suscipit.</p>

   <form action="">
        <input type="email" placeholder="enter your email">
        <input type="submit" value="subscribe">
   </form>

</section>

<section class="reviews" id="reviews">

    <h1 class="heading"> client's <span>review</span> </h1>

    <div class="swiper review-slider">

        <div class="swiper-wrapper">

            <div class="swiper-slide box">
                <img src="image/pic-1.png" alt="">
                <div class="content">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>
                    <h3>john deo</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/pic-2.png" alt="">
                <div class="content">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>
                    <h3>john deo</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/pic-3.png" alt="">
                <div class="content">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>
                    <h3>john deo</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/pic-4.png" alt="">
                <div class="content">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>
                    <h3>john deo</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/pic-5.png" alt="">
                <div class="content">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>
                    <h3>john deo</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                </div>
            </div>

            <div class="swiper-slide box">
                <img src="image/pic-6.png" alt="">
                <div class="content">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ipsam incidunt quod praesentium iusto id autem possimus assumenda at ut saepe.</p>
                    <h3>john deo</h3>
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                    </div>
                </div>
            </div>

        </div>

        <div class="swiper-pagination"></div>

    </div>

</section>

<section class="contact" id="contact">

    <h1 class="heading"><span>contact</span> us</h1>

    <div class="row">

        <iframe class="map" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d30153.788252261566!2d72.82321484621745!3d19.141690214227783!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7b63aceef0c69%3A0x2aa80cf2287dfa3b!2sJogeshwari%20West%2C%20Mumbai%2C%20Maharashtra%20400047!5e0!3m2!1sen!2sin!4v1632137920043!5m2!1sen!2sin" allowfullscreen="" loading="lazy"></iframe>

        <form action="">
            <h3>get in touch</h3>
            <input type="text" placeholder="your name" class="box">
            <input type="email" placeholder="your email" class="box">
            <input type="tel" placeholder="subject" class="box">
            <textarea placeholder="your message" class="box" cols="30" rows="10"></textarea>
            <input type="submit" value="send message" class="btn">
        </form>

    </div>

</section>

<section class="footer" id="footer">

    <div class="box-container">

        <div class="box">
            <h3>our branches</h3>
            <a href="#"> <i class="fas fa-map-marker-alt"></i> india </a>
            <a href="#"> <i class="fas fa-map-marker-alt"></i> japan </a>
            <a href="#"> <i class="fas fa-map-marker-alt"></i> france </a>
            <a href="#"> <i class="fas fa-map-marker-alt"></i> russia </a>
            <a href="#"> <i class="fas fa-map-marker-alt"></i> USA </a>
        </div>

        <div class="box">
            <h3>quick links</h3>
            <a href="#"> <i class="fas fa-arrow-right"></i> home </a>
            <a href="#"> <i class="fas fa-arrow-right"></i> vehicles </a>
            <a href="#"> <i class="fas fa-arrow-right"></i> services </a>
            <a href="#"> <i class="fas fa-arrow-right"></i> featured </a>
            <a href="#"> <i class="fas fa-arrow-right"></i> reviews </a>
            <a href="#"> <i class="fas fa-arrow-right"></i> contact </a>
        </div>

        <div class="box">
            <h3>contact info</h3>
            <a href="#"> <i class="fas fa-phone"></i> +123-456-7890 </a>
            <a href="#"> <i class="fas fa-phone"></i> +111-222-3333 </a>
            <a href="#"> <i class="fas fa-envelope"></i> shaikhanas@gmail.com </a>
            <a href="#"> <i class="fas fa-map-marker-alt"></i> mumbai, india - 400104 </a>
        </div>

        <div class="box">
            <h3>contact info</h3>
            <a href="#"> <i class="fab fa-facebook-f"></i> facebook </a>
            <a href="#"> <i class="fab fa-twitter"></i> twitter </a>
            <a href="#"> <i class="fab fa-instagram"></i> instagram </a>
            <a href="#"> <i class="fab fa-linkedin"></i> linkedin </a>
            <a href="#"> <i class="fab fa-pinterest"></i> pinterest </a>
        </div>

    </div>

    <div class="credit"> created by mr. web designer | all rights reserved </div>

</section>










<script src="https://unpkg.com/swiper@7/swiper-bundle.min.js"></script>

<script src="js/script.js"></script>

</body>
</html>