<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>
<%@page import="com.tech.blog.helper.ConnectionProvider" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--css-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <!--font awesome application web from w3 school-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            
            .banner-background{
                clip-path: polygon(30% 0%, 70% 0%, 99% 0, 100% 100%, 65% 91%, 36% 95%, 0 92%, 0 0);
            }
        </style>
        
            
        <title>JSP Page</title>
    </head>
    <body>
        <!--navbar-->
        <%@include file="normal_navbar.jsp" %>
         <!--banner-->
         <!--https : //bennettfeely.com/clippy/    (change the background design using this website)-->
         <div class="container-fluid p-0 m-0 banner-background">
             <div class="jumbotron primary-background text-white">
                 <div class="container p-0">
                     <h3 class="display-4">Welcome to TechBlog</h3>
                     <p>A programming language is a system of notation for writing computer programs.[1] Most programming languages are text-based formal languages, but they may also be graphical. They are a kind of computer language.</p>
                     <p>Programming language theory is the subfield of computer science that studies the design, implementation, analysis, characterization, and classification of programming languages.</p>
                     <button class="btn btn-outline-light btn-lg"><span class="	fa fa-user-plus"></span>Start ! its Free </button>
                     <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle-o fa-spin"></span> Login </a>
                     
                 </div>
                 
             </div>
                 
             
         </div>
         <!--//banner-->
         
         
         <br>
         <!--cards-->
         <div class="container">
             <div class="row mb-2">
                 <div class="col-md-4">
                     <div class="card">                       
                        <div class="card-body">
                          <h5 class="card-title">Java Programming</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary text-white">Go somewhere</a>
                        </div>
                      </div>
                 </div>
                 <div class="col-md-4">
                     <div class="card">                       
                        <div class="card-body">
                          <h5 class="card-title">Java Programming</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary text-white">Go somewhere</a>
                        </div>
                      </div>
                 </div>
                 <div class="col-md-4">
                     <div class="card">                       
                        <div class="card-body">
                          <h5 class="card-title">Java Programming</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary text-white">Go somewhere</a>
                        </div>
                      </div>
                 </div>
             </div>
             
                 <div class="row">
                 <div class="col-md-4">
                     <div class="card">                       
                        <div class="card-body">
                          <h5 class="card-title">Java Programming</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary text-white">Go somewhere</a>
                        </div>
                      </div>
                 </div>
                 <div class="col-md-4">
                     <div class="card">                       
                        <div class="card-body">
                          <h5 class="card-title">Java Programming</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary text-white">Go somewhere</a>
                        </div>
                      </div>
                 </div>
                 <div class="col-md-4">
                     <div class="card">                       
                        <div class="card-body">
                          <h5 class="card-title">Java Programming</h5>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          <a href="#" class="btn btn-primary text-white">Go somewhere</a>
                        </div>
                      </div>
                 </div>
             </div>
         </div>
         <!--//cards-->
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        <!--javascript-->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js" 
                integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" 
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
        <script>
//            $(document).ready(function(){
//                alert("document loded");
//            });
        </script>
    </body>
</html>
