/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *   Copyright (c) 2021. DR Corporation. All rights reserved.
 *  *   Licensed under the MIT License. See License.txt in the project root for license information
 *  *  --------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.demo.Db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Dilshan Rajika Withanachchi <dilshanrajitha1998@gmail.com>
 * @Time :10:04 AM
 * @Date :2021-10-09/Oct
 * @Project Name :Tradex_Application
 */
public class CrudUtil {

        public static <T>T execute(String sql,Object... param) throws SQLException, ClassNotFoundException {

            PreparedStatement preparedStatement = DBConnection.getInstance().getConnection().prepareStatement(sql);

            for (int i = 0; i <param.length ; i++) {
                preparedStatement.setObject((i+1),param[i]);
                System.out.println(param[i]);
            }
            if (sql.startsWith("SELECT")){
                return (T)preparedStatement.executeQuery();

            }

            return ((T)(Boolean)(preparedStatement.executeUpdate()>0));

        }

}
