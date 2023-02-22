/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.tech.blog.servlets;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import java.io.File;

/**
 *
 * @author KANCHA KANCHA
 */
@MultipartConfig
public class EditServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           // String user_id=request.getParameter("user_id");
            String user_email=request.getParameter("user_email");
            String user_password=request.getParameter("user_password");            
            String user_name=request.getParameter("user_name");            
            String user_gender=request.getParameter("user_gender");            
            String user_about=request.getParameter("user_about");
            Part part=request.getPart("image");
            String image_name=part.getSubmittedFileName();
            
            //get the user from the session...
            HttpSession s=request.getSession();
            User user=(User)s.getAttribute("currentUser");
            
            user.setEmail(user_email);
            user.setName(user_name);
            user.setPassword(user_password);
            user.setAbout(user_about);
            String oldFile=user.getProfile();
            user.setProfile(image_name);
            
            
            
            //update datablse
            UserDao userDao=new UserDao(ConnectionProvider.getConnection());
            boolean ans=userDao.updateUser(user);
            if(ans){
                
                String path=request.getRealPath("/")+"pics"+File.separator+user.getProfile();
                
                String pathOldFile=request.getRealPath("/")+"pics"+File.separator+oldFile;
                //delete photo code
                if(!oldFile.equals("default.png"))
                 Helper.deleteFile(pathOldFile); 
                if(Helper.saveFile(part.getInputStream(), path)){
                    out.println("update to db");
                    Message msg=new Message("Profile details updated....","success","alert-success");
                    s.setAttribute("msg", msg);
                }else{
                    Message msg=new Message("Somting Went Wrong","Error","alert-danger");
               
                s.setAttribute("msg", msg);
                }
              
            }else{
                out.println("not Updated");
                Message msg=new Message("Somting Went Wrong","Error","alert-danger");
               
                s.setAttribute("msg", msg);
            }
            response.sendRedirect("profile.jsp");
            //User user=new User(user_name,user_email,user_password,user_gender,user_about);
            
            
            
            
            
            
            out.println("</body>");
            out.println("</html>");
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
