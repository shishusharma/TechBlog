
package com.tech.blog.dao;
import com.tech.blog.entities.User;
import java.sql.*;

public class UserDao {
    private Connection con;
    public UserDao(Connection con){
        this.con=con;
    }
    
      
    
    //method to insert user to data base
    public boolean saveUser(User user){
        boolean f=false;
        try{
           //user --> database;
           
           
           String query="insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
           PreparedStatement pstmt=this.con.prepareStatement(query);
           pstmt.setString(1, user.getName());
           pstmt.setString(2, user.getEmail());
           pstmt.setString(3, user.getPassword());
           pstmt.setString(4, user.getGender());
           pstmt.setString(5, user.getAbout());
           
           pstmt.executeUpdate();
           f=true;
           
        }catch(Exception ex){
            System.out.println("UserDao --> "+ex);
        }
        return f;
    }
    
    ///get user by useremail and userpassword:
    public User getUserByEmailAndPassword(String userEmail,String userPassword){
        User user=null;
        try{
           String query="select * from user where email=? and password=?" ;
            System.out.println("com.tech.blog.dao.UserDao.getUserByEmailAndPassword()"+userEmail+" "+userPassword);
           PreparedStatement pstmt=con.prepareStatement(query);
           pstmt.setString(1, userEmail);
           pstmt.setString(2, userPassword);
           ResultSet set=pstmt.executeQuery();
           if(set.next()){
               user=new User();
               
               String name=set.getString("name");
               System.out.println("com.tech.blog.dao.UserDao.getUserByEmailAndPassword() "+name);
               user.setName(name);
               user.setId(Integer.parseInt(set.getString("id")));
               user.setEmail(set.getString("email"));
               user.setPassword(set.getString("password"));
               user.setGender(set.getString("gender"));
               user.setAbout(set.getString("about"));
               user.setDateTime(set.getTimestamp("rdate"));
               user.setProfile(set.getString("profile"));
               
               
           }
        }catch(Exception ex){
            System.out.println("com.tech.blog.dao.UserDao.getUserByEmailAndPassword() "+ex);
        }
        
        return user;
    }
    public boolean updateUser(User user){
        boolean f=false;
        try{
            String query="update user set name=?,email=?,password=?,gender=?,about=?,profile=? where id=?";
            PreparedStatement p=con.prepareStatement(query);
            p.setString(1,user.getName() );
            p.setString(2,user.getEmail() );
            p.setString(3,user.getPassword() );
            p.setString(4,user.getGender() );
            p.setString(5,user.getAbout() );
            p.setString(6,user.getProfile() );
            p.setInt(7, user.getId());
            p.executeUpdate();
                    f=true;
        }catch(Exception ex){
            
        }
        return f;
    }
   
}
