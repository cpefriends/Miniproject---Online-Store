package com.onlinestore.onlinestore.Presentation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("product")
@RestController
public class ProductController {
    // Database objects
    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;
    private String query;

    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String CONN_STRING = "jdbc:mysql://localhost:3306/onlinestore?serverTimezone=UTC";

    @GetMapping
    public String printSample(){
        return "HELLO";
    }

    @RequestMapping(value = "/testdb")
    public String testDB(){
        if(connectToDatabase()){
            return "Connected to database";
        }else{
            return "Not connected to database";
        }
    }

    @RequestMapping(value = "/getProductName")
    public String getProductName(){
        if(connectToDatabase()){
            query = "SELECT * FROM products";

            try{
                statement = conn.prepareStatement(query);
                resultSet = statement.executeQuery(query);

                resultSet.next();
                return resultSet.getString("productName");
            }catch (SQLException e){
                //do nothing
            }

            return "NONE";
        }else{
            return "Not connected to database";
        }
    }
    public boolean connectToDatabase(){
        try{
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
