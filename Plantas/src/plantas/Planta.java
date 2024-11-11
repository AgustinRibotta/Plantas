package plantas;

// La idea es no generar objetos de tipo plantas ya que es class abstract
public abstract class Planta {
    
    private String nobre;
    private double altoTallo;
    private boolean tieneHoja;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nobre, double altoTallo, boolean tieneHoja, String climaIdeal) {
        this.nobre = nobre;
        this.altoTallo = altoTallo;
        this.tieneHoja = tieneHoja;
        this.climaIdeal = climaIdeal;
    }

    public String getNobre() {
        return nobre;
    }

    public void setNobre(String nobre) {
        this.nobre = nobre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHoja() {
        return tieneHoja;
    }

    public void setTieneHoja(boolean tieneHoja) {
        this.tieneHoja = tieneHoja;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    protected abstract void decirLoQueSoy();
    
}
