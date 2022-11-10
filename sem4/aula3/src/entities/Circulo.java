package entities;
import enums.Cor;
public class Circulo extends Forma {

    private Double raio;

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;

    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    //agora sobrescrevemos o metodo area dea acordo com a regra da classe
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }


}
