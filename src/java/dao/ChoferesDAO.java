 
package dao;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Choferes;

public class ChoferesDAO extends DAO{
    
    public List<Choferes> cargar() throws Exception{
        try{
            this.conectar();
            String sql="select * from chofer";
            PreparedStatement pst = this.getCn().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            List<Choferes> lista = new ArrayList<Choferes>();
            while(rs.next()){
                Choferes ch = new Choferes();
                ch.setId(rs.getString(1));
                ch.setChofer(rs.getString(2));
                ch.setFecha(rs.getString(3));
                ch.setCategoria(rs.getString(4));
                ch.setSueldo(rs.getString(5));
                lista.add(ch);
            }
            
            return lista;
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }
    
    public double total() throws Exception{
        try{
            this.conectar();
            String sql="select * from chofer";
            PreparedStatement pst = this.getCn().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             
            double total = 0;
            while(rs.next()){
                total+=rs.getDouble(5);
            }
            
            return total;
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        
    }
    
    public int filas() throws Exception{
        try{
            this.conectar();
            String sql="select * from chofer";
            PreparedStatement pst = this.getCn().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             
            int fila = 0;
            while(rs.next()){
                fila++;
            }
            
            return fila;
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        
    }
}
