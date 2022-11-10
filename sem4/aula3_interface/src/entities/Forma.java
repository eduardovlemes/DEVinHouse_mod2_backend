package entities;

//podemos retirar o enum


// classe Forma vai virar uma interface
public interface Forma {

    //retiramos a cor, interfaces não possuem atributos

    //metodo abstrato area

    // apagaremos o public abstract pois na interface já se presume que o método é público e abstrato
    double area();

}

//ok, agora temos uma interface apontando que
// todo objeto que for uma figura
// precisa implementar o método ou operação area


//agora vamos criar uma nova classe abstrata.
