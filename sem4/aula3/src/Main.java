import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import enums.Cor;

import javax.xml.transform.stream.StreamSource;
import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {

        Forma f1 = new Circulo(Cor.BLACK, 2.0);
        Forma f2 = new Retangulo(Cor.WHITE, 3.0, 4.0);

        System.out.println("Cor do circulo: " + f1.getCor());
        System.out.println("Area do circulo: " + String.format("%.3f",f1.area()));
        System.out.println("Cor do retangulo: " + f2.getCor());
        System.out.println("Area do retangulo: " + String.format("%.3f",f2.area()));

    }
}