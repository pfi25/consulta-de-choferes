 
package dao;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Choferes;
import modelo.Viajes;

public class ViajesDAO extends DAO{
    
    
    public List<Viajes> cargar(Choferes cho) throws Exception{
        try{
            this.conectar();
            final String sql="select * from viaje where idcod=?";
            PreparedStatement pst = this.getCn().prepareStatement(sql);
            pst.setString(1,cho.getId());
            ResultSet rs = pst.executeQuery();
            
            List<Viajes> lista = new ArrayList<Viajes>();
            while(rs.next()){
                Viajes v = new Viajes();
                v.setIdViaje(rs.getString(1));
                v.setIdBus(rs.getString(2));
                v.setCodRuta(rs.getString(3));
                v.setCodChofer(rs.getString(4));
                v.setHorasViaje(rs.getString(5));
                v.setFechaViaje(rs.getString(6));
                v.setCostoViaje(rs.getString(7));
                lista.add(v);
            }
            
            return lista;
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }
}
