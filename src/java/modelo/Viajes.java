 
package modelo;
 
public class Viajes {

    private String idViaje;
    private String idBus;
    private String codRuta;
    private String codChofer;
    private String horasViaje;
    private String fechaViaje;        
    private String costoViaje;
    private Choferes cho;
 
    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public String getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(String codRuta) {
        this.codRuta = codRuta;
    }

    public String getCodChofer() {
        return codChofer;
    }

    public void setCodChofer(String codChofer) {
        this.codChofer = codChofer;
    }

    public String getHorasViaje() {
        return horasViaje;
    }

    public void setHorasViaje(String horasViaje) {
        this.horasViaje = horasViaje;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getCostoViaje() {
        return costoViaje;
    }

    public void setCostoViaje(String costoViaje) {
        this.costoViaje = costoViaje;
    }
    
    
    public Choferes getCho() {
        return cho;
    }

    public void setCho(Choferes cho) {
        this.cho = cho;
    }
}
