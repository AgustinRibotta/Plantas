package plantas;

public class Flor extends Planta {

    private String colorPetalo;
    private String colorPistilo;
    private String variedad;
    private String estacion;
    private int cantPetalo;

    public Flor() {
    }

    public Flor(String colorPetalo, String colorPistilo, String variedad, String estacion, int cantPetalo, String nobre, double altoTallo, boolean tieneHoja, String climaIdeal) {
        super(nobre, altoTallo, tieneHoja, climaIdeal);
        this.colorPetalo = colorPetalo;
        this.colorPistilo = colorPistilo;
        this.variedad = variedad;
        this.estacion = estacion;
        this.cantPetalo = cantPetalo;
    }

    public String getColorPetalo() {
        return colorPetalo;
    }

    public void setColorPetalo(String colorPetalo) {
        this.colorPetalo = colorPetalo;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public int getCantPetalo() {
        return cantPetalo;
    }

    public void setCantPetalo(int cantPetalo) {
        this.cantPetalo = cantPetalo;
    }
    
     
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una Flor");
    }
    
}
