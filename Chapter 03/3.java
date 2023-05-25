package studenttable;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
fis = new FileInputStream("C:\\BatchProcessing\\src\\studenttable\\db.properties");
props.load(fis);

Class.forName(props.getProperty("driver"));

  con = DriverManager.getConnection(props.getProperty("url"), 
props.getProperty("username"), 
props.getProperty("password"));

con.setAutoCommit(false);

          Statement stmt = con.createStatement();
            /*
             String create_query = "CREATE TABLE EMPLOYEE("
             + " EMPID INTEGER PRIMARY KEY,"
             + " FIRSTNAME VARCHAR(20) NOT NULL,"
             + " LASTNAME  VARCHAR(20) NOT NULL,"
             + " DESIGNATION VARCHAR(20) NOT NULL)";

ResultSetrs = stmt.executeQuery(create_query);

             */

//stmt.addBatch("INSERT INTO EMPLOYEE VALUES(1,'ABC','XYZ','MANAGER')");
//stmt.addBatch("INSERT INTO EMPLOYEE VALUES(2,'DEF','PQR','CLERK’)");
//stmt.executeBatch();
//con.commit();
//con.close();

PreparedStatementps = con.prepareStatement("INSERT INTO EMPLOYEE 
VALUES(?,?,?,?)");

BufferedReaderbr = new BufferedReader(new InputStreamReader(System.in));

 while (true) 
{
System.out.println("Enter id");
                String s1 = br.readLine();
int id = Integer.parseInt(s1);

System.out.println("Enter first name");
                String fname = br.readLine();

System.out.println("Enter last name");
                String lname = br.readLine();

System.out.println("Enter Designation");
                String designation = br.readLine();

ps.setInt(1, id);
ps.setString(2, fname);
ps.setString(3, lname);
ps.setString(4, designation);

ps.addBatch();

System.out.println("Want to add more records y/n");
                String ans = br.readLine();

  if (ans.equals("n")) 
{
                    break;
                }

            }
ps.executeBatch();

        } 
catch (SQLException | IOException | ClassNotFoundException e) 
{
System.err.println("Exception occured \n" + e);
con.rollback();

        }
    }
}