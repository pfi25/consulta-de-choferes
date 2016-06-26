 
package beans;

import dao.ViajesDAO;  
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Choferes;
import modelo.Viajes;
 
@ManagedBean
@ViewScoped
public class ViajeBean {

    private List<Viajes> lista;
    private Choferes cho = new Choferes();
    private Viajes viaje;
    private ViajesDAO v = new ViajesDAO();

    public Viajes getViaje() {
        return viaje;
    }

    public void setViaje(Viajes viaje) {
        this.viaje = viaje;
    }

    public Choferes getCho() {
        return cho;
    }

    public void setCho(Choferes cho) {
        this.cho = cho;
    }

    public ViajesDAO getV() {
        return v;
    }

    public void setV(ViajesDAO v) {
        this.v = v;
    }
   
    public List<Viajes> getLista() {
        return lista;
    }

    public void setLista(List<Viajes> lista) {
        this.lista = lista;
    }
    
    
    
    public void cargar() throws Exception{
        lista = v.cargar(cho);
    }
    
}
