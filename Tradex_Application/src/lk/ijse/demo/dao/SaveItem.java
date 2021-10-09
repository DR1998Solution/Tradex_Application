/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *   Copyright (c) 2021. DR Corporation. All rights reserved.
 *  *   Licensed under the MIT License. See License.txt in the project root for license information
 *  *  --------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.demo.dao;

import lk.ijse.demo.Db.CrudUtil;

import java.sql.SQLException;

/**
 * @author Dilshan Rajika Withanachchi <dilshanrajitha1998@gmail.com>
 * @Time :10:17 AM
 * @Date :2021-10-09/Oct
 * @Project Name :Tradex_Application
 */
public class SaveItem {
    public static void   saveItem(String id ,String description){
        try {
            boolean execute = CrudUtil.execute("INSERT INTO Item VALUES(?,?)",id,description);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
