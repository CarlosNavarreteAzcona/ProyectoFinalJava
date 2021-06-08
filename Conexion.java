
package ProyectoFinal;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Carlos Navarrete
 */
public class Conexion 
{
   public static Connection getConexion()
   {
        String usr = "sa";
        String pwd = "123";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost\\MYSERVIDORSQL:1433;databaseName=JavaJ3";
        
        try
        {
            Connection con = DriverManager.getConnection(url,usr,pwd);
            return con;
        }
   
        catch(SQLException e)
        {
            System.out.println(e.toString());
            return null;
        } 
   }
}
