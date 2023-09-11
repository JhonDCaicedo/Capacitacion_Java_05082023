public class Llanta {

    private String fabricante;
    private int ancho;
    private int perfil;
    private int rin;

    Llanta(String fabricante, int ancho, int perfil, int rin){
        this.fabricante = fabricante;
        this.ancho = ancho;
        this.perfil = perfil;
        this.rin = rin;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAncho() {
        return ancho;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }

    public int getRin() {
        return rin;
    }

}
