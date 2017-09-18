package edu.javacourse.customer.impl.dao;

import edu.javacourse.customer.api.dao.ConnectionBuilder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBuilderImpl implements ConnectionBuilder
{
    private static ConnectionBuilderImpl instance;
    
    private String driverName;
    private String url;
    private String login;
    private String password;



    private ConnectionBuilderImpl() {
        this.driverName = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/mysql";
        this.login = "root";
        this.password = "root";
    }

    public static synchronized ConnectionBuilderImpl getInstance() {
        if(instance == null) {
            instance = new ConnectionBuilderImpl();
        }
        return instance;
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, login, password);
    }

}

