 
package modelo;
 
public class Ruta {
 
    private String codRuta;
    private String nomRuta;
    private String pgChofer;

    public Viajes getViaje() {
        return viaje;
    }

    public void setViaje(Viajes viaje) {
        this.viaje = viaje;
    }
    private Viajes viaje;

    public String getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(String codRuta) {
        this.codRuta = codRuta;
    }

    public String getNomRuta() {
        return nomRuta;
    }

    public void setNomRuta(String nomRuta) {
        this.nomRuta = nomRuta;
    }

    public String getPgChofer() {
        return pgChofer;
    }

    public void setPgChofer(String pgChofer) {
        this.pgChofer = pgChofer;
    }
    
    
}
