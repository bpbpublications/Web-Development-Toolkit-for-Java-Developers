package studenttable;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;


public class StudentTable
{
    public static void main(String[] args) throws SQLException
	{
                Properties props = new Properties();
FileInputStreamfis = null;
        Connection con = null;
        try
		{
fis=new FileInputStream("D:\\StudentTable\\src\\studenttable\\db.properties");
props.load(fis);

	Class.forName(props.getProperty("driver"));

con = DriverManager.getConnection(props.getProperty("url"), 
props.getProperty("username"), 
props.getProperty("password"));

          Statement stmt = con.createStatement();

			/*String create_query = "CREATE TABLE STUDENT("
					             + " STUDENTID INTEGER PRIMARY KEY,"
					             + " NAME VARCHAR(30) NOT NULL,"
					             + " COURSE VARCHAR(30) NOT NULL,"
						 + " GRADE CHAR(2) NOT NULL)";

		stmt.execute(create_query); */

	String insert_query = "INSERT INTO STUDENT VALUES("
					+ " 4,'ABC','MCA','AA')";


		            String select_query = "SELECT * FROM STUDENT";

	con.setAutoCommit(false);

	Savepoint savepoint1 = con.setSavepoint("Savepoint1");

	stmt.executeUpdate(insert_query);

		ResultSetrs = stmt1.executeQuery(select_query);



			inti = 0;
	
			while (rs.next()) 
			{
System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " \n ");
	i++;
	            }
	
			System.out.println("\n rows before rollback statement :  " + i + "\n");
		con.rollback(savepoint1);
	con.commit();

	rs = stmt1.executeQuery(select_query);
	i = 0;
		
while (rs.next()) 
{
System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " \n ");
	i++;
            }

			System.out.println("\n rows after rollback statement :  " + i + "\n");

        } 
	catch (SQLException | IOException | ClassNotFoundException e) 
	{
System.err.println("Exception occured \n" + e);
        }
    }

}