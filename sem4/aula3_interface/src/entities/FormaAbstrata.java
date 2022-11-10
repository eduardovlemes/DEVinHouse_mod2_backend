package entities;

import enums.Cor;

//se a classe não for abstrata o compilador não deixará passar
//como essa classe é abstrata ela não implementará o método area(),
// pois apenas as classes concretas implementam métodos
public abstract class FormaAbstrata implements Forma {

    private Cor cor;

    public FormaAbstrata(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }




}
