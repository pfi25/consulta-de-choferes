 
package beans;

import dao.ChoferesDAO; 
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Choferes;
 
@ManagedBean
@ViewScoped
public class ChoferBean {
    
    private List<Choferes> choferes;
    private double total;
    private int fila;
    
    ChoferesDAO ch = new ChoferesDAO();
    public void cargar() throws Exception{
        choferes = ch.cargar();
        total = ch.total();
        fila = ch.filas();
    } 

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ChoferesDAO getCh() {
        return ch;
    }

    public void setCh(ChoferesDAO ch) {
        this.ch = ch;
    }

    public List<Choferes> getChoferes() {
        return choferes;
    }

    public void setChoferes(List<Choferes> choferes) {
        this.choferes = choferes;
    }
 
    
  
    
}
