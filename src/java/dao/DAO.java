 
package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
 
    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public void conectar() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            final String URL="jdbc:mysql://"  
              +  System.getenv().get( "OPENSHIFT_MYSQL_DB_HOST" )  
              +  ":"  
              +  System.getenv().get( "OPENSHIFT_MYSQL_DB_PORT" )  
              +  "/app01";
            cn = DriverManager.getConnection(URL,"adminES4TKZH","1MaWwQvH2yS9");
        }catch(ClassNotFoundException e){
            throw e;
        } catch (SQLException e) {
            throw e;
        }
    }
    
    public void cerrar() throws Exception{
        try{
        if(cn!=null){
            if(cn.isClosed()==false){
                cn.close();
            }
        }
        }catch(Exception e){
            throw e;
        }
    }
}
