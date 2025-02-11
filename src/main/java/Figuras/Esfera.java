package Figuras;

public class Esfera extends FiguraGeometrica{
    private double radio;

    public Esfera(double radio){
        this.radio = radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public double calcularSuperficie() {
        return 4.0 * Math.PI * Math.pow(this.radio, 2.0);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
