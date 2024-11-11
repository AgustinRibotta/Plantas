package plantas;

public class Arbol extends Planta {

    private String varidead;
    private String tipoTronco;
    private String coloer;
    private String tipoHoja;
    private double radio;

    public Arbol() {
    }

    public Arbol(String varidead, String tipoTronco, String coloer, String tipoHoja, double radio, String nobre, double altoTallo, boolean tieneHoja, String climaIdeal) {
        super(nobre, altoTallo, tieneHoja, climaIdeal);
        this.varidead = varidead;
        this.tipoTronco = tipoTronco;
        this.coloer = coloer;
        this.tipoHoja = tipoHoja;
        this.radio = radio;
    }

    public String getVaridead() {
        return varidead;
    }

    public void setVaridead(String varidead) {
        this.varidead = varidead;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getColoer() {
        return coloer;
    }

    public void setColoer(String coloer) {
        this.coloer = coloer;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy un Arbol");
    }
    
}
