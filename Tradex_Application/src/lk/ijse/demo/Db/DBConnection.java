/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *   Copyright (c) 2021. DR Corporation. All rights reserved.
 *  *   Licensed under the MIT License. See License.txt in the project root for license information
 *  *  --------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.demo.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Dilshan Rajika Withanachchi <dilshanrajitha1998@gmail.com>
 * @Time :9:20 AM
 * @Date :2021-10-09/Oct
 * @Project Name :Tradex_Application
 */
public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ijseTradex","root","ijse");
    }
    public Connection getConnection(){
        return  connection;

    }
    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if(null==dbConnection){
            dbConnection=new DBConnection();

        }
        return dbConnection;

    }
}
