package entities;
import enums.Cor;

// devemos alterar então qual a classe que as subclasses estendem, agora é a FormaAbstrata
public class Circulo extends FormaAbstrata {

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

    //agora sobrescrevemos o metodo area de acordo com a regra da classe
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }


}
