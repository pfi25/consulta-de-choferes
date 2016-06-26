 
package dao;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List; 
import modelo.Ruta;
import modelo.Viajes;

public class RutaDAO extends DAO{
 
    public List<Ruta> cargar(Viajes v) throws Exception{
        try{
            this.conectar();
            final String sql="select * from ruta where rutcod=?";
            PreparedStatement pst = this.getCn().prepareStatement(sql);
            pst.setString(1,v.getCodRuta());
            ResultSet rs = pst.executeQuery();
            
            List<Ruta> lista = new ArrayList<Ruta>();
            while(rs.next()){
                Ruta r = new Ruta(); 
                r.setCodRuta(rs.getString(1));
                r.setNomRuta(rs.getString(2));
                r.setPgChofer(rs.getString(3));
                lista.add(r);
            }
            
            return lista;
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }
}
