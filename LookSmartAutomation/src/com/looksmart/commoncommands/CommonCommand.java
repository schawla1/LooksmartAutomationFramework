package com.looksmart.commoncommands;

import java.io.File;
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.looksmart.pages.*;




public class CommonCommand {
	BaseClass baseClass=new BaseClass();
	static Connection conn = null;
    static Statement stmt = null;
    public static Array accounts_id;
    List<String> result=new ArrayList<String>();
    //HashMap<Integer, V>


	public static void makeDirectory(String path)
	{
		File file=new File(path);
		if(!file.exists())
		{
			file.mkdir();
		}
		else
			System.out.println("File  Already Exists");
	}
	
	public static String dateFormat()
	{
		String fileNameInDateFormat = new SimpleDateFormat("yyyyMMddhhmmss'scenario_1.png'").format(new java.util.Date());
		System.out.println("Date is"+ fileNameInDateFormat);
		return fileNameInDateFormat;
	}
	public String sqlQuery(String query) {

        try {

                Class.forName(baseClass.jdbcDriver);
                System.out.println(baseClass.dbUrl + baseClass.dbUserName + baseClass.dbPassword+ "query is"+ query);
                conn = DriverManager.getConnection(baseClass.dbUrl, baseClass.dbUserName, baseClass.dbPassword);

                String sql;
                stmt = conn.createStatement();
                sql = query;
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) // Loop is not necessary it's necessary when we
                                                        // there are more than one row
                {
                	//accounts_id=rs.getArray("account_id");
                        //account_id = rs.getString("Account_id");
                		//accounts_id.
                	System.out.println(rs.getMetaData());
                	
                	result.add(rs.getString("account_id"));
                        
                }
                rs.close();
                stmt.close();
                conn.close();
      
        } catch (SQLException se) {
                se.printStackTrace();
        } catch (Exception e) {
                e.printStackTrace();
        } finally {

                try {
                        if (stmt != null || conn != null) {
                                stmt.close();
                                conn.close();
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }

        }
        return "hi";


	
	
	}
//	public static void main(String [] args)
//	{
//		BaseClass baseClass=new BaseClass();
//		CommonCommand aa=new CommonCommand();
//		baseClass.getQuery();
//		aa.sqlQuery(baseClass.queryA);
//	}
}

	


