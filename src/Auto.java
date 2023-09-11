public class Auto {
    private String color;
    private String marca;
    private String modelo;
    private int ruedas;
    private int puertas;
    private int numeroEspejos;
    private Llanta llanta;

    Auto(String color,String marca,String modelo,int ruedas,int puertas,int numeroEspejos,Llanta llanta){
        this.color = color;
        this.marca = marca;
        this.ruedas = ruedas;
        this.modelo = modelo;
        this.puertas = puertas;
        this.numeroEspejos = numeroEspejos;
        this.llanta = llanta;
    };

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public int getNumeroEspejos() {
        return numeroEspejos;
    }

    public void setNumeroEspejos(int numeroEspejos) {
        this.numeroEspejos = numeroEspejos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
