 
package beans;

import dao.RutaDAO;  
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Ruta;
import modelo.Viajes;
 
@ManagedBean
@ViewScoped
public class RutaBean {
 
    private List<Ruta> lista;
    private Viajes viaje = new Viajes();
    private RutaDAO rut = new RutaDAO();
    private Ruta ruta;

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    
    public List<Ruta> getLista() {
        return lista;
    }

    public void setLista(List<Ruta> lista) {
        this.lista = lista;
    }

    public Viajes getViaje() {
        return viaje;
    }

    public void setViaje(Viajes viaje) {
        this.viaje = viaje;
    }

    public RutaDAO getRut() {
        return rut;
    }

    public void setRut(RutaDAO rut) {
        this.rut = rut;
    }
    
    public void cargar() throws Exception{
        lista = rut.cargar(viaje);
    }
    
}
